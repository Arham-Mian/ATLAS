import java.util.Scanner;
public class Task3 {
public static void main(String[] args) {
    System.out.println("Please enter the number at the position of a");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Please enter the number at the position of b");
    int b = sc.nextInt();

    System.out.println("Your original number are : a =" + a +" and b =" + b );
    
    int c = a;
    a = b;
    b = c;
    System.out.println("Your Changed number are : a =" + a +" and b =" + b );
    sc.close();
}  
}
