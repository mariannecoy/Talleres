package taller;

public class main {

    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro perro = new Perro("Firulais", 3);
        Gato gato = new Gato("Miau", 2);

        // Mostrar la información de ambos animales
        System.out.println(perro.getNombre() + " tiene " + perro.getEdad() + " años.");
        System.out.println(gato.getNombre() + " tiene " + gato.getEdad() + " años.");

        // Crear un zoológico y agregar animales
        Zoologico zoologico = new Zoologico();
        zoologico.agregarAnimal(perro);
        zoologico.agregarAnimal(gato);

        // Mostrar los sonidos de todos los animales en el zoológico
        zoologico.mostrarSonidos();
    }
}