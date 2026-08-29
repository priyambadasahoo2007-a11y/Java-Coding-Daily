
public class Palindrome
{
    public static void main(String[] args) {
        int number = 121;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            num = num / 10;
        }

        return originalNumber == reversedNumber;
    }
}
