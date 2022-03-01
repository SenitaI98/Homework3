import java.util.Scanner;

public class Task1aa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter total number (different from 0):");
        int total = reader.nextInt();
        if (total != 0 ){
            positiveNumbers(total);
        } else {
            System.out.println("You entered 0!");
        }
    }
    public static void positiveNumbers (int positiveNumber){
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("Enter number greater than 0:");
            positiveNumber = reader.nextInt();
        } while (positiveNumber > 0);
    }
}
