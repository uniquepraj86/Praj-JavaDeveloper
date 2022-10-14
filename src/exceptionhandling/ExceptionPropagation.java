package exceptionhandling;

// only unchecked exception is propagated
public class ExceptionPropagation {

    public void a() {
        int i = 10 / 0;

    }

    public void b() {
        try {
            this.a();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
        public void c () {
            this.b();
        }

        public static void main (String[]args){
          ExceptionPropagation obj = new ExceptionPropagation();
            obj.c();
        }
    }
