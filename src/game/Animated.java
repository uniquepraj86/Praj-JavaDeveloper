package game;

public class Animated implements Runnable {
    BlockBreakerPanel bp;

    Animated(BlockBreakerPanel b) {
        bp = b;
    }

    @Override
    public void run() {
        while (true) {
            bp.update();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
        throw new RuntimeException(e);
//                e.printStackTrace();
            }
        }
    }
}
