
public class Simple {

    public static void main(String[] args) {
        String word = "swiss";

        for (char c : word.toCharArray()) {
            // Check if the first and last position of the character are the same
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                System.out.println("Result: " + c);
                return;
            }
        }

        System.out.println("Result: _");
    }
}
