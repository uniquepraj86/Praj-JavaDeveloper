package basicprograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no");
        a=sc.nextInt();
        
        if(a%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}

