package day_3.models;

public class Person {
    private String firstName;
    private String lastName;
    private String identityCard;
    private int age;
    private double height;
    private boolean married;
    private String[] petNames;

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married, String[] petNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petNames = petNames;
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

    public String[] getPetNames() {
        return petNames;
    }

    public void setPetNames(String[] petNames) {
        this.petNames = petNames;
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
        System.out.println("Mis mascotas se llaman: ");
        for(String mascota : this.getPetNames()) {
            System.out.println("* " + mascota);
        }
    }
}