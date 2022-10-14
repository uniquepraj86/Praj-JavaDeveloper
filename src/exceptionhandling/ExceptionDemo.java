/**
Exception Handling-handle the runtime errors.............

 Advantages- To maintain the normal flow of the application..............

 Types of Java Exception - 1)   Checked exception
                           2)   Un Checked exception
                           3)   Error


 **/



package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        int i = 10;
        int j = 5;
        int k = 0;
        Scanner scanner = null;
        try {
            k = i / j;
            Scanner Scanner = new Scanner(System.in);
            try {
                String str = null;
                System.out.println(str.toUpperCase());
                System.out.println("in nested");
            } catch (NullPointerException e) {
                System.out.println("Null pointer ==>" + e);
            } catch (ArithmeticException a) {
                System.out.println(a);
            }

            System.out.println("In try block");
        } catch (Exception e) {
            System.out.println("Runtime==>" + e);
        } finally {
//            scanner.close();
            System.out.println("In finally");
        }


        System.out.println(k);
        System.out.println("Hii");
    }
}