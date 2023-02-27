package oops.abstraction.exAbstraction;

public class Football extends Sport{


    @Override
    public void play() {
        System.out.println("play football");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
    }
}
