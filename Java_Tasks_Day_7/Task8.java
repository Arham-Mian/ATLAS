import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number (num1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number (num2): ");
        int num2 = sc.nextInt();

        // Check which number is greater
        if (num1 > num2) {
            System.out.println("num1 is greater");
        } else {
            System.out.println("num2 is greater");
        }

        sc.close();
    }
}

