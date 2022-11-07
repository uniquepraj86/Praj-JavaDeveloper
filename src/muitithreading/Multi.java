package muitithreading;

public class Multi implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In Run Method");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(500);
        Multi obj = new Multi();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
