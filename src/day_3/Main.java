package day_3;

import day_3.models.Pet;
import day_3.models.Person;
import day_3.models.PetType;


import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Lolo", PetType.GATO, 2);
        Pet pet2 = new Pet("Olivia", PetType.GATO, 3);
        Person persona1 = new Person("Agustín", "Rúveda", "36508066", 32, 1.72, false);
        persona1.addPet(pet1);
        persona1.addPet(pet2);
        persona1.introduceYourself();
    }
}