package sync.wait_notify;

public class MyThread2 extends Thread {

    private final Object lock;

    MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始 notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time" + System.currentTimeMillis());
        }
    }
}
