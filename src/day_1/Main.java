package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ejercicio 1
 /*       String name = "Edmundo";
        String lastName = "Rúveda";
        byte age = 32;

        System.out.println("Hello, my name is " + name + " " + lastName + " and I'm " + age + " years old.");
*/
//        ejercicio 2
//        welcome("Juan");

//        ejercicio 3
       /* Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter another number: ");
        int num2 = input.nextInt();
        System.out.println("One more please: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The bigger one is the number 1  " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The bigger one is the number 2 " + num2);
        } else {
            System.out.println("The bigger one is the number 3 " + num3);
        }
        input.close();*/

//        ejercicio 4

/*        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        input.close();
   */
//        ejercicio 5

/*      Scanner input = new Scanner (System.in);
        System.out.println("Please enter a text:");
        String text1 = input.nextLine();
        System.out.println("Please enter another text:");
        String text2 = input.nextLine();

        if(text1.equals(text2)) {
            System.out.println("They are the same.");
        } else {
            System.out.println("They're not the same.");
        }*/

//        ejercicio 6
/*        int number = 12;
        if(prime(number)) {
            System.out.println("The number " + number + " is prime.");
        } else {
            System.out.println("The number " + number + " is not a prime.");
        }
   */
//       ejercicio 7

//        int[] arrayNums = {13, 22, 5, 6};
   /*     System.out.println(sumOdds((arrayNums)));
*/
//        ejercicio 8

//        System.out.println(printEvensSumPrimes(arrayNums));


//        ejercicio 9 y 10

//        calculator(5, 4);
//            ejercicio 11 y 12

        int MAX_CAPACITY = 500;
        float normalTicket = 1500;
        float vipTicket = 2000;
        int currentCapacity = MAX_CAPACITY;
        double moneyRaised = 0;

        while (true) {
            System.out.println("Be welcome to StrikeZone Bowling Center!");
            System.out.println("Menu");
            System.out.println("1. Data entry");
            System.out.println("2. Capacity");
            System.out.println("3. Money raised");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter your personal data:");
                    System.out.print("Name: ");
                    String name = input.next();
                    System.out.print("Age: ");
                    int age = input.nextInt();
                    System.out.print("ID: ");
                    String id = input.next();
                    System.out.print("What kind of pass do you have? (VIP/discounted/none: ");
                    String passType = input.next().trim();

                    boolean vipPass = passType.equalsIgnoreCase("vip");
                    boolean discountedPass = passType.equalsIgnoreCase("discounted");

                    if (age < 21) {
                        System.out.println("Sorry, only people older than 21 years old can enter. Thank you for your understanding.");
                        return;
                    }

                    float ticketPrice;

                    if (vipPass) {
                        ticketPrice = 0;
                        System.out.println("Please enter.");
                    }
                    System.out.print("Do you want to buy a normal or a VIP ticket? (normal/VIP): ");
                    String ticketType = input.next();

                    if (ticketType.equalsIgnoreCase("vip")) {
                        if (discountedPass) {
                            ticketPrice = vipTicket / 2;
                        } else {
                            ticketPrice = vipTicket;
                        }
                    } else {
                        if (discountedPass) {
                            ticketPrice = normalTicket / 2;
                        } else {
                            ticketPrice = normalTicket;
                        }
                    }

                    if (currentCapacity == 0) {
                        System.out.println("Sorry, the place is full. Try again later.");
                    } else {
                        System.out.println("Welcome to StrikeZone Bowling Center, " + name + "! Enjoy your time!");
                        currentCapacity--;
                        moneyRaised += ticketPrice;
                    }
                    break;
                case 2:
                    System.out.println("Capacity: " + currentCapacity);
                    break;
                case 3:
                    System.out.println("Money raised: " + moneyRaised);
                    break;
                case 0:
                    System.out.println("Good bye, see you soon.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
    public static void welcome(String name) {System.out.println("Hello, " + name);
    }
    public static boolean prime(int number) {
        if (number > 0) {
            if (number == 2) {
                return true;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static int sumOdds (int[] numbers) {
        int sumOdds = 0;
        for (int number : numbers ){
            if(number % 2 != 0) {
                sumOdds += number;
            }
        }
        return sumOdds;
    }

    public static int printEvensSumPrimes(int[] arrayNumbers ) {
        int totalPrimes = 0;
        for(int number : arrayNumbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            } else if (prime(number)) {
                totalPrimes += number;
            }
        }
        return totalPrimes;
    }
    public static byte menuCalculator () {
        Scanner input = new Scanner(System.in);
        System.out.println("1 = Sum");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Multiply");
        System.out.println("4 = Division");
        System.out.println("0 = exit");
        byte operation = input.nextByte();
        input.close();
        return operation;
    }
    public static void calculator(float num1, float num2) {

        byte operation = menuCalculator();
        switch (operation) {
            case 1 :
                System.out.println(num1 + num2);
                break;
            case 2 :
                System.out.println(num1 - num2);
                break;
            case 3 :
                System.out.println(num1 * num2);
            case 4 :
                if(num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Sorry I can't divide by 0.");
                }
                break;
            case 0 :
                System.out.println("Okay, good bye then.");
                break;
            default :
                System.out.println("What do you mean?");
                break;
        }
    }
}

