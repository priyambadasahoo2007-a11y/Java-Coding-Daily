
import java.util.Scanner; // Import the Scanner class to read user input

public class InteractiveProgram {

    public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote yet. You must wait " + yearsLeft + " more year(s).");
        }
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a string from the user

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer from the user

        // Greet the user
        System.out.println("\nHello, " + name + "!");

        // Call the method to check eligibility based on the input age
        checkVotingEligibility(age);

        // Close the scanner to free up system resources
        scanner.close();
    }
}
