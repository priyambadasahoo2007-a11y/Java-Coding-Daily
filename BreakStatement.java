/*
Your task is to add if and break statements so that only the numbers from 1 to 15 will be printed, the loop will exit before printing the numbers from 16 to 20.
 */

public class BreakStatement {

    public static void main(String args[]) {
        for (int i = 1; i < 20; i++) {
            if ( i == 16 ) {
                break;
            }
            System.out.println(i);
        }
    }
}
