package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        //Initialize array
        int[] arr = {1, 2, 3, 4, 5, 1, 4, 2 ,2};

//        System.out.println("Array is: "+ arr);
//        ARRAY
        System.out.println(" Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Do you want to continue?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("What is your choice?");
            System.out.println("1. Reverse Number");
            System.out.println("2. Duplicate Number");
            System.out.println("3. Even or Odd");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("Reverse Numbers : ");
                    for (int i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                case 2:
                    System.out.println("\nDuplicate Number: ");
                    for (int i = 0; i < arr.length-1; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[i] == arr[j])

                                System.out.print(arr[j]);

                        }
                    }
                    break;
                case 3:
                    System.out.println("\nEven Numbers:");
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0) {
                            System.out.print(arr[i]);

                        }
                    }
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }else{
            System.out.println("End Process");
            System.out.println("Thank You");
        }

    }}
