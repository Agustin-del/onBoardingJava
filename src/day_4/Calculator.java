package day_4;

public class Calculator implements CalculatorOperations{

    @Override
    public void addition(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    @Override
    public void substraction(double num1, double num2) {
        System.out.println(num1 - num2);
    }

    @Override
    public void multiplication(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    @Override
    public void division(double num1, double num2) {
        if(num2 != 0) {
            System.out.println(num1 / num2);
        }
    }
}
