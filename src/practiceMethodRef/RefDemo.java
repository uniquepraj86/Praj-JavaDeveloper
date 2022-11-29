package practiceMethodRef;

import java8.LambdaExpression;

import java.time.LocalDate;

public class RefDemo {

    public class Stuff{
    public static void doStuff() {
        System.out.println("I am doing Task");
        LocalDate now = LocalDate.now();
        System.out.println(now);

    }
    }
    public static void main(String[] args) {
        System.out.println("Learning Method reference....");

//        workInter workInter=()->{
//            System.out.println("this is done task new method");
//        };
        workInter workInter =Stuff::doStuff;
        workInter.doTask();

    }
}

@FunctionalInterface
interface workInter{
     void  doTask();
}