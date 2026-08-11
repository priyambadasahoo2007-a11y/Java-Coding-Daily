/* Write a program that gets the user's age as input.

The program will output (print) the number of missing years till 120 (in a specific format, shown below).

For example, for input 25, the expected output is "95 years till 120".*/
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the user's age as an integer
        int age = scanner.nextInt();

        // Calculate the remaining years until 120
        int missingYears = 120 - age;

        // Print the result exactly in the requested format
        System.out.println(missingYears + " years till 120");

        // Close the scanner
        scanner.close();
    }
}
