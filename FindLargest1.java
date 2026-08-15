
public class FindLargest1 {

    public static void main(String[] args) {
        // Initialize an array with sample integer values
        int[] numbers = {12, 45, 2, 89, 23};

        // Assume the very first element is the largest initially
        int largest = numbers[0];

        // Loop through the remaining elements of the array
        for (int i = 1; i < numbers.length; i++) {
            // If the current element is bigger, update our tracker
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print the final highest value discovered
        System.out.println("The largest number in the array is: " + largest);
    }
}
