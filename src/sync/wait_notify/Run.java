package sync.wait_notify;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();


        MyThread1 myThread1 = new MyThread1(lock);
        myThread1.start();

        Thread.sleep(3000);

        MyThread2 myThread2 = new MyThread2(lock);
        myThread2.start();
    }
}
