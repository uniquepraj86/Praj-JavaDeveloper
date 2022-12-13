package loops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("Enter the id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println("enter department");
        String dept =sc.next();
        switch (id){
            case 1:
                System.out.println("Praj");
                break;
            case 2:
                System.out.println("Shiv");
                break;
            case 3:
                switch(dept){
                    case"Physics":
                        System.out.println("Management Department");
                        break;

                    case "Software":
                        System.out.println("IT Department");
                        break;
                    default:
                        System.out.println("No department is selected");
            }
        }
    }
}
