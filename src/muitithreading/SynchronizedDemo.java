package muitithreading;

public class SynchronizedDemo {
    int num;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo obj = new SynchronizedDemo();
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                for (int i = 1; i <= 1000; i++) {
                    obj.increase();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                for (int i = 1; i <= 1000; i++) {
                    obj.increase();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.num);
    }

    public void increase() {
        synchronized (this) {
            num++;
        }
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
    }
}
