/*
Create a simple multiplication table for numbers 1 through 5. The output should look exactly like this:

Multiplication Table (1-5):
-------------------------
1  2  3  4  5
2  4  6  8  10
3  6  9  12 15
4  8  12 16 20
5  10 15 20 25
5 rows - Each row represents multiplying by 1, 2, 3, 4, and 5 respectively
5 columns - Each row shows products when multiplied by 1 through 5
Pattern:
Row 1: 1×1, 1×2, 1×3, 1×4, 1×5
Row 2: 2×1, 2×2, 2×3, 2×4, 2×5
Row 3: 3×1, 3×2, 3×3, 3×4, 3×5
And so on...
Spacing: Each number occupies a 3-character-wide field (left-aligned). Single-digit numbers are followed by 2 spaces; double-digit numbers are followed by 1 space. The last number in each row has no trailing spaces.
Alignment: Numbers are left-aligned within their 3-character field — for example, 1 (1 + 2 spaces), 10 (10 + 1 space), except the last number in each row which has no padding
 */

public class Multiplication {

    public static void main(String[] args) {

        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int result = i * j;

                if (j == 5) {
                    System.out.print(result);
                } else {
                    System.out.printf("%-3d", result);
                }
            }
            System.out.println();
        }
    }
}
