package assignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int i,temp=0,no;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number :");
        no = sc.nextInt();
        for(i=2; i<=no/2;i++){
            if( no==0 || no==1){
                System.out.println("not a prime");
            } else if (no%i==0){
                System.out.println("not a prime");
                
            }else
            {
                System.out.println("no is prime");
            }
        }
    }
}
