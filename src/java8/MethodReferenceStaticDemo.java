package java8;

public class MethodReferenceStaticDemo {
    public static void main(String[] args) {
        MethodReferenceDemo obj = new MethodReferenceDemo();
        MyInterface3  myInterface4 = obj::display;


        myInterface4.show();
    }

    public void display(){
        System.out.println("In Display");


    }
}

@FunctionalInterface
interface MyInterface4{
    void show();
}