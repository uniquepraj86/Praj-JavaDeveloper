package java8;

import java.util.function.BiFunction;

class Arithmetic {
    public static Float add(Float a,Float b){
        return a+b;

    }
}


public class MethodReferenceExample {

    public static void main(String[] args) {


        BiFunction<Float,Float,Float> adder = Arithmetic::add;
        Float result = adder.apply(40.0f,30.0f);
        System.out.println(result);

    }
}
