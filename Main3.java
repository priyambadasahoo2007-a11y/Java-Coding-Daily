/*
Write a program that gets a String input from the user.

The program will output "T" if the input equals "1" and "F" otherwise.

Hint: In Java, use .equals() to compare Strings instead of ==, as == checks reference equality and may not work correctly for String comparison.
 */
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("1")) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}
