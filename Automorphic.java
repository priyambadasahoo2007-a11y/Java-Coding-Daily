import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int divisor = 1;

        // Find 10, 100, 1000... according to number of digits
        while (temp > 0) {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        // Check last digits of square
        if (square % divisor == num) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }

        sc.close();
    }
}