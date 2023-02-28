package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40};
        int arr1[] = {60,70,80,90};
       int a = arr.length;
       int b = arr1.length;

       int[] concate = new int[a+b];
        System.out.println(Arrays.toString(concate));
    }
}
