import java.util.Scanner;

public class q2 {

    static int num1, num2;
    static int sum, product;

    // Function to get numbers
    public static void getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
    }

    // Function to add numbers
    public static void addNumbers() {
        sum = num1 + num2;
        System.out.println("Addition done.");
    }

    // Function to multiply numbers
    public static void multiplyNumbers() {
        product = num1 * num2;
        System.out.println("Multiplication done.");
    }

    // Function to display results
    public static void displayResults() {
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Get numbers");
            System.out.println("2. Add two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Display results");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            // Switch to call functions
            switch (choice) {
                case 1:
                    getNumbers();
                    break;
                case 2:
                    addNumbers();
                    break;
                case 3:
                    multiplyNumbers();
                    break;
                case 4:
                    displayResults();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5); // loop keeps menu showing

        input.close();
    }
}