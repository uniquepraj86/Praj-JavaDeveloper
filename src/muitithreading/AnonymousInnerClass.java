package muitithreading;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void Show() {
                System.out.println("In show Method");
            }

            @Override
            public int add(int a, int b) {
                return 0;
            }
        };
        myInterface.Show();
    }

    interface MyInterface{
        void Show();
        int add(int a,int b);
    }
}
/**
 * lamba  = to implements functional interface.
 * Functional Interface - it contains only abstract method,it contains only one functionality to implements.
 *                       1) Default Method - Runnable,ActionalListener,Comarable
 */