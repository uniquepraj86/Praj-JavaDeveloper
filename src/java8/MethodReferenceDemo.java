package java8;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        MethodReferenceDemo obj = new MethodReferenceDemo();
        MyInterface3  myInterface3 = obj::display;


        myInterface3.show();
    }

    public void display(){
        System.out.println("In Display");


    }
}

@FunctionalInterface
interface MyInterface3{
    void show();
}