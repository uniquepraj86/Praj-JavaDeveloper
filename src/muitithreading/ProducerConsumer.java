package muitithreading;

public class ProducerConsumer {
    int num;

    boolean flag = false;
    public synchronized void setNum(int num) {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Set: " + num);
        this.num = num;

        flag = true;
        notify();
    }

    public  synchronized void getNum() {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get :" + num);
        flag = false;
        notify();
    }

}


class Main1 {
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread t1 = new Thread(()-> {
            int i = 1;
            while (true) {
                producerConsumer.setNum(i++);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread t2 = new Thread(()-> {
            while (true) {
                producerConsumer.getNum();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}