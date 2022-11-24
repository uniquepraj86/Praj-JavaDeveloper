package string;

public class ReverseString {
    public static void main(String[] args) {

        /**
         * Reverse number
         */

        int n=123456789, rev = 0;
        while (n!=0){
            int remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n/10;
        }
        System.out.println("The reverse of the given number is: " + rev);

    }

    /**
     * Reverse string
     */


}
