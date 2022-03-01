import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int number = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (number != -10){
            Scanner reader = new Scanner(System.in);
            System.out.println("Please enter any integer");
            number = reader.nextInt();
            list.add(number);
            if (number == -10){
                list.remove(list.size()-1);
                for (int i = 0; i<list.size(); i++ ){
                    System.out.print(list.get(i) + " ");
                }
                System.out.println("\nDo you want to add more numbers: y/n");
                char yORn = reader.next().charAt(0);
                if (yORn == 'y'){
                    System.out.println("Please enter any integer");
                    number = reader.nextInt();
                    list.add(number);
                } else if(yORn == 'n'){
                    break;
                }
            }

        }
    }
}
