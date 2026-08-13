
public class MaxArrayElement {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 93, 23, 56};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
