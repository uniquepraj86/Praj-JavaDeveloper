package java8;


//@FunctionalInterface
interface msg{
    void say(String msg);
}


public class FunctionalExpression implements msg{
   public void say(String msg){
       System.out.println(msg);
   }


    public static void main(String[] args) {
        FunctionalExpression obj = new FunctionalExpression();
        obj.say("Welcome to Codkul");

    }


}
