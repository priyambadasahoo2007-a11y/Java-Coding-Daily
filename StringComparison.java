public class StringComparison
{
    public static void main(String[] args)
    {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        //equalsIgonreCase
        boolean result1 = str1.equalsIgnoreCase(str2);
        //equals
        boolean result2 = str1.equals(str3);
        boolean result3 = str3.equals(str2);
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);


    }
}