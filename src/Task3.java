
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Choose option: \n1.Is string a palinddrom \n2.Filter an Array \n3.Number is divisible by x");
        int option = reader.nextInt();
        switch (option) {
            case 1:
                boolean isOrNot = isPalindrom("");
                if (isOrNot) {
                    System.out.println("Word is a palindrom");
                } else {
                    System.out.println("Word is not a palindrom");
                }
                break;
            case 2:
                System.out.println("How many elements do you want in your array?");
                int numberElements = reader.nextInt();
                ArrayList<Integer> list = new ArrayList<>();
                System.out.println("Please enter " + numberElements + " elements");
                for (int i = 0; i < numberElements; i++) {
                    int element = reader.nextInt();
                    list.add(element);
                }
                removeFromList(list);
                char yORn;
                do {
                    System.out.println("Do you want to remove other number in array (y/n)?");
                    yORn = reader.next().charAt(0);
                    if (yORn == 'y' || yORn == 'Y') {
                        removeFromList(list);
                    } else if (yORn == 'n' || yORn == 'N') {
                        break;
                    } else {
                        System.out.println("You enered letter different than y/n");
                    }
                } while (yORn == 'y' || yORn == 'Y');
                break;
            case 3:
                System.out.println("Please enter number:");
                int number = reader.nextInt();
                System.out.println("Check if " + number + " is divisible by which number?");
                int x = reader.nextInt();
                boolean divisible = isDivisible(number, x);
                if (divisible) {
                    System.out.println("Number " + number + " is divisible by " + x);
                } else {
                    System.out.println("Number " + number + " is not divisible by " + x);
                }
                break;
        }
    }

    public static boolean isPalindrom(String word) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a word");
        word = reader.nextLine().toLowerCase();
        char[] wordToChar = word.toCharArray();
        char[] orginalword = Arrays.copyOf(wordToChar, wordToChar.length);
        for (int i = 0; i < wordToChar.length / 2; i++) {
            char temo = wordToChar[i];
            wordToChar[i] = wordToChar[wordToChar.length - i - 1];
            wordToChar[wordToChar.length - i - 1] = temo;
        }
        return Arrays.equals(wordToChar, orginalword);
    }

    public static void removeFromList(ArrayList<Integer> list) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Which element do you want to remove? " + list);
        int elementToRemove = reader.nextInt();
        list.remove(Integer.valueOf(elementToRemove));             // OR list.remove(new Integer(elementToRemove));
        System.out.println("Your array after removal looks like this: " + list);
    }

    public static boolean isDivisible(int number, int x) {
        return number % x == 0;
    }
}
