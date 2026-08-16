
public class SimpleTargetSearch {

    public static void main(String[] args) {
        // Your list of numbers
        int[] numbers = {12, 45, 7, 23, 19};

        // The number you are looking for
        int target = 23;

        // Loop through every number in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found target " + target + " at index: " + i);
                return; // Stop the program early since we found it
            }
        }

        // This runs only if the loop finishes without finding the target
        System.out.println("Target " + target + " not found in the array.");
    }
}
