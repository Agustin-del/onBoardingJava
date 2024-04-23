package day_3.models;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private Set<Pet> pets = new HashSet<>();

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        pet.setOwner(this);
    }
    public void introduceYourself() {
        System.out.println("¡Hola! Mi nombre es " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Tengo " + this.getAge() + " años");
        if(this.isMarried()) {
            System.out.println("Estoy casado/a");
        } else {
            System.out.println("No estoy casada/o");
        }
        System.out.println("Mi DNI es " + this.getIdentityCard());
        System.out.println("Mis mascota/s se llama/n: ");
        for(Pet pet : this.getPets()) {
            System.out.println("* " + pet.getName() + " es un " + pet.getType().toString().toLowerCase() + " y tiene " + pet.getAge() + " años.");
        }
    }
}