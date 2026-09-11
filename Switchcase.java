
import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Java");
                break;

            case 2:
                System.out.println("Python");
                break;

            case 3:
                System.out.println("C++");
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
