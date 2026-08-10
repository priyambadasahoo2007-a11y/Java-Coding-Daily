
import java.util.Scanner; // Step 1: Import the Scanner class

public class ScannerExample {

    public static void main(String[] args) {
        // Step 2: Create a Scanner object for reading keyboard input
        Scanner scanner = new Scanner(System.in);

        // Step 3: Read a String (Full line of text)
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // Step 4: Read an Integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Step 5: Read a Double (Decimal number)
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Step 6: Print the gathered information back to the user
        System.out.println("\n--- User Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("GPA: " + gpa);

        // Step 7: Close the scanner to prevent resource leaks
        scanner.close();
    }
}
