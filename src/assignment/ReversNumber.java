package assignment;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        int[] arr = {123451422};

        System.out.println("Reverse Numbers : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
