/*
Write a program that gets a dynamic number of input values.

The first input is a number that represents the number of the input values following it. The next input values are whole numbers.

In the end, print the sum of all the input numbers (not including the first input).
 */
import java.util.Scanner;

public class DynamicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}
