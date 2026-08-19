
import java.util.Scanner;

public class WhileStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        double number = scanner.nextDouble();

        while (number >= 3.5) {
            number = number / 2;
        }
        System.out.println(number);

        scanner.close();
    }
}
