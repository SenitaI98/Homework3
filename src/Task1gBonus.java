import java.util.Scanner;

public class Task1gBonus {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int startNumber = startingNumber(1);
        char operation;
        do {
            System.out.println("Which operation would you like to use: *,/,+,-?");
            operation = reader.next().charAt(0);
            if (operation == '=') {
                System.out.println("Calculator result is: " + startNumber);
                break;
            }
            System.out.println("Please enter integer: ");
            int number = reader.nextInt();
            switch (operation) {
                case '+':
                    startNumber = addition(startNumber, number);
                    break;
                case '-':
                    startNumber = deduction(startNumber, number);
                    break;
                case '*':
                    startNumber = multiplication(startNumber, number);
                    break;
                case '/':
                    startNumber = division(startNumber, number);
                    break;
            }
        } while (operation != '=');
    }

    public static int startingNumber(int startNumber) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Would you like to enter starting number (y-YES n-NO):");
        char option = reader.next().charAt(0);
        if (option == 'y') {
            System.out.println("Please enter starting number:");
            startNumber = reader.nextInt();
        } else if (option == 'n') {
            startNumber = 0;
        }
        return startNumber;
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int deduction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
