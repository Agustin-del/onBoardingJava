package day_4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu{

    @Override
    public void calculatorMenu() {
        System.out.println("""
                1. Addition
                2. Substraction
                3. Multiplication
                4. Division
                0. Quit
                """);
    }

    @Override
    public boolean selectedOperation() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        if(choice != 0) {
            System.out.print("Enter a number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter another number: ");
            double num2 = scanner.nextDouble();

            switch(choice) {
                case 1:
                    calculator.addition(num1, num2);
                    return true;
                case 2:
                    calculator.substraction(num1, num2);
                    return true;
                case 3:
                    calculator.multiplication(num1, num2);
                    return true;
                case 4:
                    calculator.division(num1, num2);
                    return true;
            }
        }
        return false;
    }
}
