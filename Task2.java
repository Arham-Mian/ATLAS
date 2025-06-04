import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int a = sc.nextInt();
        System.out.println("Please enter your Second number");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("your addition is : " + c);
        sc.close();

    }
    
}
