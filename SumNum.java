
import java.util.Scanner; // Import the Scanner class to read user input

public class SumNum {

    public static void main(String[] args) {
        // Create a Scanner object to read console input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner to prevent memory leaks
        scanner.close();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the final result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
