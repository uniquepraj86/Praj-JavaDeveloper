package miniproject;

import java.util.Scanner;

public class BinomialExpansion {
    public static void main(String[] args) {
        int n;
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBinomial expansion of"+"(a+b)n");
        System.out.println("enter a:");
        a=sc.nextLine();
        System.out.println("enter b:");
        b= sc.nextLine();
        while(true){
            System.out.println("Enter n:");
            n = sc.nextInt();
            if(n<34 && n>=0)break;
            System.out.println("Enter Positive" + "integer <34 for n");

        }

//        Printer.printExpansion(a,b,n);
    }
}
