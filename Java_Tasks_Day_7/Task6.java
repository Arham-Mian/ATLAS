    import java.util.Scanner;

public class Task6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Id: ");
        String id = sc.nextLine();

        System.out.print("Pwd: ");
        String pwd = sc.nextLine();

        // Mask the password with asterisks
        String maskedPwd = "*".repeat(pwd.length());

        // Display the output
        System.out.println("\nHi ,\n");
        System.out.println("\tYour login id is " + id);
        System.out.println("And your pwd is " + maskedPwd);

        sc.close();
    }
}


