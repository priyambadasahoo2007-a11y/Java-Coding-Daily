
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Calculator App");

        // Changed println to printf on these four lines:
        System.out.printf("sum: %.2f\n", sum);
        System.out.printf("difference: %.2f\n", difference);
        System.out.printf("product: %.2f\n", product);
        System.out.printf("quotient: %.2f\n", quotient);

        scanner.close();
    }
}
