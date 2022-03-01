import java.util.Scanner;

public class Task1a {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter two integers: ");
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.println("Sum of numbers: " + a + " and " + b + " is " + sum(a,b));
        System.out.println("Difference of numbers: " + a + " and " + b + " is " + difference(a,b));
        System.out.println("Product of numbers: " + a + " and " + b + " is " + product(a,b));
        System.out.println("Quotient of numbers: " + a + " and " + b + " is " + quotient(a,b));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int difference (int a, int b){
        return a-b;
    }
    public static int product (int a, int b){
        return a*b;
    }
    public static int quotient (int a, int b){
        return a / b;
    }
}
