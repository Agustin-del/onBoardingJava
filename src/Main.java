import day_2.models.Person;
public class Main {
    public static void main(String[] args) {
        Person persona = new Person("Agustin", "Rúveda", "36508066", 32, 1.73, false, new String[]{"Lolo", "Olivia"});
        persona.introduceYourself();
    }

}