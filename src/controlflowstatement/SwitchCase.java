package controlflowstatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The date");
        int day = sc.nextInt();

//        int day=1;
        switch (day) {
            case 1, 8, 15, 22, 29:
                System.out.println("Sunday");
                break;
            case 2, 9, 16, 23, 30:
                System.out.println("Monday");
                break;
            case 3, 10, 17, 24, 31:
                System.out.println("Tuesday");
                break;
            case 4, 11, 18, 25:
                System.out.println("Wednesday");
                break;
            case 5, 12, 19, 26:
                System.out.println("Thursday");
                break;
            case 6, 13, 20, 27:
                System.out.println("Friday");
                break;
            case 7, 14, 21, 28:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("wrong Choice");
                break;


        }
    }
}
