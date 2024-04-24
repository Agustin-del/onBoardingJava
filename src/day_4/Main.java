package day_4;

public class Main {
    public static void main(String[] args) {
        CalculatorWithMenu menu = new CalculatorWithMenu();
        boolean choice;
        do {
            menu.calculatorMenu();
            choice = menu.selectedOperation();
        } while (choice);
    }



}
