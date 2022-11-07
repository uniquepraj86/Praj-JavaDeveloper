package muitithreading;



public class Thread1  extends Thread{

    @Override
    public void run() {

    }

}

class ThreadClassImpl{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();

    }

}




