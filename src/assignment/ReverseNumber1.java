package assignment;


import java.util.Scanner;

public class ReverseNumber1 {

    public static void main(String[] args) {

//        int n;
//       //         int reverse = 0;
//
//         for(n=12345;n !=0;n=n/10)
//         {
//             int remainder = n%10;
//             reverse = reverse * 10 + remainder;
//         }
//        System.out.println(reverse);
//

        int n;
        int re,r=0;
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);

         n= sc.nextInt();
        for(; n!=0; n=n/10)
        {
            re = n%10;
            r =r * 10 +re;

        }
        System.out.println(r);

    }


}





















