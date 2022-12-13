package java8;

public class MethodRefConstructor {

    MethodRefConstructor(){
        System.out.println("In Const");
    }

    public static void main(String[] args) {
//        MethodRefConstructor obj = new MethodRefConstructor();
        MyInterface5 myInterface5 = MethodRefConstructor::new;
        myInterface5.getConst();
    }
}

interface MyInterface5{
    MethodRefConstructor getConst();
}