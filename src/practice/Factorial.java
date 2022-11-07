package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = s.nextInt();
        int i,fact =1;

        for(i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " +number+" is : "+fact);
    }
}
