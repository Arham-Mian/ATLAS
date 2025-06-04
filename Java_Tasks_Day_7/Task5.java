import java.util.Scanner;

public class Task5 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Using ternary operator to compare
        String result = (a > b) ? "a is greater than b" : "b is greater than or equal to a";

        // Printing result
        System.out.println(result);

        scanner.close();
    }
}

    

