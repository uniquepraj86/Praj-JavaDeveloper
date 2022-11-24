package assignment;

import java.util.Scanner;

public class PositiveNegativeNumber {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int num;
//        System.out.println("Enter the number");
//        num = sc.nextInt();
//        if (num > 0) {
//            System.out.println("The number is positive");
//        } else if (num < 0) {
//            System.out.println("The number is negative");
//        } else {
//            System.out.println("Zero");
//        }
//    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num = sc.nextInt();
        if (num == 0)
        {
            System.out.println ("Zero");
        }
        else{
            String result = num > 0 ? "The number is positive" : "The number is negative";
            System.out.println (result);
        }
    }


}



