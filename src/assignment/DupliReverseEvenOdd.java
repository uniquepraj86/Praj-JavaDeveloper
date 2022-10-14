package assignment;

import java.util.*;

public class DupliReverseEvenOdd {
    public static void main(String[] args) {
        {
            int i;
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the Size of Array: ");
            int tot = scan.nextInt();
            int[] arr = new int[tot];

            System.out.println("Enter " +tot+ " Elements for the Array: ");
            for(i=0; i<tot; i++)
                arr[i] = scan.nextInt();

            System.out.println("\nReverse of Given Array is: ");
            for(i=(tot-1); i>=0; i--)
                System.out.print(arr[i]+ " ");
        }

    }

}

