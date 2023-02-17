package assignment;

public class Main {
    public static void main(String[] args) {
        String str = "my name is prajakta";
        int len = 8; // number of characters to retrieve from the end of the string

        // check if the string is long enough
        if (str.length() < len) {
            System.out.println("The string is not long enough to retrieve the last " + len + " characters.");
        } else {
            // use the substring method to retrieve the last 3 characters
            String last3 = str.substring(str.length() - len);
            System.out.println("The last " + len + " characters of the string are: " + last3);
            System.out.println("The length of last " + len + " characters is: " + last3.length());
        }
    }
}





