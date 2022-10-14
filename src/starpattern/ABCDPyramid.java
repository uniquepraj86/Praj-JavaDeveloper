package starpattern;

import java.util.Scanner;

public class ABCDPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        {
            int alphabet = 65;
            for (int i = 0; i <=rows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print((char) (alphabet + j) + " ");
                }
                System.out.println();
            }
        }
    }
}