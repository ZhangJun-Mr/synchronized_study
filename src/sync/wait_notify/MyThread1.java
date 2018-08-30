package sync.wait_notify;

public class MyThread1 extends Thread {

    private final Object lock;

    MyThread1(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始 wait time="+System.currentTimeMillis());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束 wait time"+System.currentTimeMillis());
        }
    }
}
