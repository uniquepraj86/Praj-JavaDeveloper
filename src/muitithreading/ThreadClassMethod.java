package muitithreading;

public class ThreadClassMethod {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in run");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t2");
                System.out.println(Thread.currentThread().isAlive());
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("in t3");
            }
        });


//        t1.setName("Test");
//        System.out.println(t1.getName());
//        System.out.println(t1.getPriority());

        t2.setPriority(1);
        t3.setPriority(10);
        t2.start();
        t3.start();

    }

}

/**
 * MinPriority -
 * Daemon - Worker Thread -Daemon thread in Java is a low-priority thread that
 *           runs in the background to perform tasks such as garbage collection
 */


















