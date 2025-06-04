// Define the Customer class
class Customer {
    // Fields
    String name;
    int id;

    // Method to display customer info
    void displayCustomerInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
    }
}

// Main class
public class Task7 {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer1 = new Customer();

        // Set customer details
        customer1.id = 1001;
        customer1.name = "Arham Mian";

        // Call the method to display customer info
        customer1.displayCustomerInfo();
    }
}

