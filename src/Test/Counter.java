package Test;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Counter {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            long  count = 0;
            System.out.println("Enter a number ::");
            long num = sc.nextLong();
            while(num!=0){
                num = num/10;
                count++;
            }
            System.out.println("Number of digits in the entered integer are :: "+count);
        }
    }

