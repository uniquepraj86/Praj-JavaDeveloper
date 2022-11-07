package muitithreading;

public class MultiThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(()->{                                               //lambda
            for(int i=1;i<=5;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
//        t1.join();
        t1.notify();
        Thread t2 = new Thread(()->{                                               //lambda
            for(int i=1;i<=5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.start();
    }
}
/**
 * Intercommunicate -Waiting
 */