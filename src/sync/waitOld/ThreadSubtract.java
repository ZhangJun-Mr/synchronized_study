package sync.waitOld;

public class ThreadSubtract extends Thread {
    private Substract r;

    public ThreadSubtract(Substract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        try {
            r.substract();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
