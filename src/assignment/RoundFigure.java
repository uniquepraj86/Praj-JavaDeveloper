package assignment;

import java.util.Scanner;

public class RoundFigure {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Double i;
        System.out.println("Enter the Number :");
        i=sc.nextDouble();

//        double i = 315;
        double div = i % 100;
        if (div <= 25) {
            System.out.println(fl(i));
        } else if (div > 25 && div <= 50) {
            System.out.println(cl(i));
        } else if (div > 50 && div <= 74) {
            System.out.println(fl(i));
        } else if (div >= 75) {
            System.out.println(cl(i));
        }
    }

    private static double fl(double i) {
        return 50 * (Math.floor(Math.abs(i / 50)));
    }

    private static double cl(double i) {
        return 50 * (Math.ceil(Math.abs(i / 50)));
    }
}
