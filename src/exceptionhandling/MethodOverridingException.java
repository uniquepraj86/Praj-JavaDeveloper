package exceptionhandling;

public class MethodOverridingException {
    public void display() throws ArithmeticException {
        System.out.println("In display method");
    }

    public static void main(String[] args) {

    }
}
    class MethodOverriding extends  MethodOverridingException{
        @Override
        public void display() {
            System.out.println(" In display method Overriding");

    }
}
/**
 * if parent class declare no exception you can declare only unchecked exception
 * if parent class declare no exception you can declare same  exception
 *  * if parent class declare no exception you can declare child  exception
 */