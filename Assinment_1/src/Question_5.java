
import java.util.Scanner;

public class Question_5 {
    static String[] friends = new String[5];
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add two numbers");
            System.out.println("2. Create array of 5 friends");
            System.out.println("3. Display data from array");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addNumbers(sc);
                    break;
                case 2:
                    createArray(sc);
                    break;
                case 3:
                    displayArray();
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (true); // menu does not disappear
    }

    static void addNumbers(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
       
             
    }

    static void createArray(Scanner sc) {
        sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter friend name: ");
            friends[i] = sc.nextLine();
        }
    }

    static void displayArray() {
        for (String f : friends) {
            System.out.println(f);
        }
    }
    
}
