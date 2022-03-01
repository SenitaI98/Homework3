import java.util.Scanner;

public class Task1c {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstNumber = startingNumber(1);
        System.out.println("Please enter integer: ");
        int secondNumber = reader.nextInt();
        System.out.println("Total of " + firstNumber + " and " + secondNumber + " is " + sum(firstNumber, secondNumber));
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

    public static int sum(int a, int b) {
        return a + b;
    }
}
