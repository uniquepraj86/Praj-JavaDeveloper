package basic;

public class PSVM {
    int i = 10;

    public String show(int i) {
        System.out.println("In show method" + i);
        return " new datatype()";
    }

    public static void main(String[] args) {
        /**
         *
         * public => is access modifier and jvm can access from outside.
         * static => without creating object of class jvm can access this method.
         * void => it return nothing.
         * main => main is identifier and entry point of java program
         * String[] => it is command line arguments
         * args => variable name
         */

        PSVM obj = new PSVM();
        String str = obj.show(2);
        System.out.println(str);

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(obj.i);
//        show(3);
    }
}
