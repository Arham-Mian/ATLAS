public class Task4 {

        // Method to add two numbers
        public static int add(int a, int b) {
            return a + b;
        }
    
        // Method to subtract two numbers
        public static int subtract(int a, int b) {
            return a - b;
        }
    
        // Method to multiply two numbers
        public static int multiply(int a, int b) {
            return a * b;
        }
    
        // Method to divide two numbers (integer division)
        public static int divide(int a, int b) {
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
                return 0;
            }
            return a / b;
        }
    
        // Main method
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;
    
            System.out.println("Main started");
    
            System.out.println("Sum of 2 numbers is " + add(num1, num2));
            System.out.println("Diff of 2 numbers is " + subtract(num1, num2));
            System.out.println("Product of 2 numbers is " + multiply(num1, num2));
            System.out.println("Division of 2 numbers is " + divide(num1, num2));
    
            System.out.println("Main ended");
        }
    }
    