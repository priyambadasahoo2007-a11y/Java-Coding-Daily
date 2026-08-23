/*
Write a program that prints a rectangle of asterisks (*) with a given width and height.

Input: Two integers: width and height

For example:

If width = 5 and height = 3
 */

import java.util.Scanner;

public class NestedStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        // Write your code below
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
