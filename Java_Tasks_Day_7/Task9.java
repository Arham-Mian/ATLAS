import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for 3 numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt();

        // Check which is greatest
        if (a >= b && a >= c) {
            System.out.println("a is the greatest");
        } else if (b >= a && b >= c) {
            System.out.println("b is the greatest");
        } else {
            System.out.println("c is the greatest");
        }

        sc.close();
    }
}
