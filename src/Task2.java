import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<Integer> listOfNumbers = new ArrayList<>();
        addNumbers((ArrayList<Integer>) listOfNumbers);
        System.out.println("Do you want to add more numbers: y/n");
        char yORn = reader.next().charAt(0);
        if (yORn == 'y' || yORn == 'Y') {
            addNumbers((ArrayList<Integer>) listOfNumbers);
        }

    }

    public static void addNumbers(ArrayList<Integer> listOfNumbers) {
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

