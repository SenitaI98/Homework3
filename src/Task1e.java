import java.util.Scanner;

public class Task1e {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Which operation would you like to use: *,/,+,-?");
        char operation = reader.next().charAt(0);
        int startNumber = startingNumber(1);
        System.out.println("Please enter integer: ");
        int secondNumber = reader.nextInt();
        switch (operation) {
            case '+':
                System.out.println("Sum of " + startNumber + " and " + secondNumber + " is " + addition(startNumber, secondNumber));
                break;
            case '-':
                System.out.println("Difference of " + startNumber + " and " + secondNumber + " is " + deduction(startNumber, secondNumber));
                break;
            case '*':
                System.out.println("Product of " + startNumber + " and " + secondNumber + " is " + multiplication(startNumber, secondNumber));
                break;
            case '/':
                System.out.println("Quotient of " + startNumber + " and " + secondNumber + " is " + division(startNumber, secondNumber));
                break;
        }
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
