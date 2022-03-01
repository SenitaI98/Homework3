import java.util.Scanner;

public class Task1b {
    public static void main(String[] args) {
        detectNumber(0);
    }
    public static void detectNumber(int number){
        while (number != -1000){
            Scanner reader = new Scanner(System.in);
            System.out.println("Please enter any integer");
            number = reader.nextInt();
            if (number == -1000){
                System.out.println("Number -1000 is detected!");
            }
        }
    }
}
