package java8;

public class LambdaExpression {
//    public static void main(String[] args) {
//     MyInterface m=()->{
//         System.out.println("in lambda");
//     };
//        m.show();
//        MyInterface1 m1 = (a,b)->{
//            System.out.println(a+b);
//        };
//        m1.add(2,4);
//    }
//    @FunctionalInterface
//    interface  MyInterface{
//        void  show();
//    }
//}
//@FunctionalInterface
//interface  MyInterface1{
//    void add(int a,int b);


    public static void main(String[] args) {
        MyInterface m = ()->{
            System.out.println("in lambda");
        };
        m.show();
        MyInterface1 m1 =(a,b,c)->{
            System.out.println(a+b-c);
        };
        m1.add(2,4,6);
    }
    @FunctionalInterface
    interface MyInterface{
        void show();
    }
    @FunctionalInterface
    interface MyInterface1{
        void add(int a,int b,int c);
    }
}