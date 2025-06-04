import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String loginid;
        String pwd;

        System.out.print("Enter your login id: ");
        loginid = sc.nextLine();

        System.out.print("Enter your password: ");
        pwd = sc.nextLine();

        // While credentials are correct
        while (loginid.equals("Prasunamba") && pwd.equals("12345867")) {
            System.out.println("You have logged in for " + (++count) + " times.");

            System.out.println("Enter your login id and password again:");
            loginid = sc.nextLine();
            pwd = sc.nextLine();
        }

        System.out.println("Invalid login credentials. Exiting.");
        sc.close();
    }
}
