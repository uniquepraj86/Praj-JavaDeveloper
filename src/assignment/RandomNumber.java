package assignment;

public class RandomNumber {
    public static void main(String[] args) {
        int min=200;
        int max = 400;

        System.out.println(min+ "to"+max);

        double a=Math.random()*(max-min+1)+min;
        System.out.println(a);

        int b= (int) (Math.random()*(max-min+1)+min);
        System.out.println(b);

        System.out.println("First Random Number:"+Math.random());
        System.out.println("Second Random Number:"+Math.random());
        System.out.println("Third Random Number:"+Math.random());
        System.out.println("Fourth Random Number:"+Math.random());
    }
}
