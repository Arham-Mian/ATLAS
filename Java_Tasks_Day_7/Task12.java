import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String loginid, pwd;

        do {
            System.out.print("Enter your login id: ");
            loginid = sc.nextLine();

            System.out.print("Enter your password: ");
            pwd = sc.nextLine();

            if (loginid.equals("Prasunamba") && pwd.equals("12345867")) {
                count++;
                System.out.println("You have logged in for " + count + " times.");
            } else {
                System.out.println("Invalid login credentials. Exiting.");
                break;
            }
        } while (true);

        sc.close();
    }
}
