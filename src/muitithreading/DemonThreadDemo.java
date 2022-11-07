package muitithreading;

public class DemonThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("run method");
    }

    public static void main(String[] args) {
        DemonThreadDemo t1 = new DemonThreadDemo();
        t1.setDaemon(true);
        t1.start();
        System.out.println(t1.isDaemon());
    }
}
