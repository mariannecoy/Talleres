public class Archivo {

    public static void guardarAnimales(List<Animal> nuevosAnimales, String rutaArchivo) {
        List<Animal> animales = cargarAnimales(rutaArchivo); // Cargar los animales existentes
        if (animales == null) {
            animales = new ArrayList<Animal>(); // Crear una nueva lista si el archivo no existe
        }
        animales.addAll(nuevosAnimales); // Agregar los nuevos animales a la lista

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            oos.writeObject(animales);
            System.out.println("Lista de animales guardada exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar la lista de animales: " + e.getMessage());
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el flujo de salida: " + e.getMessage());
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Animal> cargarAnimales(String rutaArchivo) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(rutaArchivo));
            return (List<Animal>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Error al cargar la lista de animales (IOException): " + e.getMessage());
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar la lista de animales (ClassNotFoundException): " + e.getMessage());
            return null;
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el flujo de entrada: " + e.getMessage());
                }
            }
        }
    }
}