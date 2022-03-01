import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        detectNumber((ArrayList<Integer>) listOfNumbers);
        char yORn = 'y';
        while (yORn == 'y' || yORn == 'Y') {
            System.out.println("Do you want to add more numbers: y/n");
            yORn = reader.next().charAt(0);
            if (yORn == 'n') {
                break;
            }
            detectNumber((ArrayList<Integer>) listOfNumbers);
        }
    }

    public static void detectNumber(ArrayList<Integer> listOfNumbers) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        while (number != -10) {
            System.out.println("Please enter any integer different than -10");
            number = reader.nextInt();
            listOfNumbers.add(number);
        }
        listOfNumbers.remove(listOfNumbers.size() - 1);
        System.out.println("You entered -10, your list look like this --> " + listOfNumbers);
    }
}

