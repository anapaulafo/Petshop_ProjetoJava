<<<<<<< Updated upstream
package service;
import model.*;
import java.util.ArrayList;

public class AnimalService {
    private final ArrayList<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        this.animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public String getAnimais() {
        return animais.toString();
    }

    public Animal getAnimalById(int idAnimal) {
        for (Animal animal : animais) {
            if (animal.getIdAnimal() == idAnimal) {
                return animal;
            }
        }
        return null;
    }


    public String getNomeAnimalById(int IdAnimal) {
        for (Animal animal : animais) {
            if (animal.getIdAnimal() == IdAnimal) {
                return animal.getNomeAnimal();
            }
        }

        return "erro";
    }
=======
package service;
import model.*;
import java.util.ArrayList;

public class AnimalService {
    private final ArrayList<Animal> animais = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        this.animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public String getAnimais() {
        return animais.toString();
    }

    public Animal getAnimalById(int idAnimal) {
        for (Animal animal : animais) {
            if (animal.getIdAnimal() == idAnimal) {
                return animal;
            }
        }
        return null;
    }


    public String getNomeAnimalById(int IdAnimal) {
        for (Animal animal : animais) {
            if (animal.getIdAnimal() == IdAnimal) {
                return animal.getNomeAnimal();
            }
        }

        return "erro";
    }
>>>>>>> Stashed changes
}