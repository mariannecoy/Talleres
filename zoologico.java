package taller;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animales;

    public Zoologico() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarSonidos() {
        for (Animal animal : animales) {
            System.out.println(animal.getNombre() + ": " + animal.hacerSonido());
        }
    }
}