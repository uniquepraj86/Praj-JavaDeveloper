package oops.polymorphism;

public class PolyDemo {

    /**
        method overloading => a class with multiple functions with same name but different number of arguments
        rule-1. changing number of arguments
             2. changing the function datatype.
         advantage -> it increase the readability of program
    **/
    private int add(int a,int b){
        return a+b;
    }

    private int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        PolyDemo obj = new PolyDemo();
        System.out.println(obj.add(5,6));

    }
}
