package sync.waitOld;

public class Substract {
    private final String lock;

    public Substract(String lock) {
        this.lock = lock;
    }

    public void substract() throws InterruptedException {
        synchronized (lock) {
            while (ValueObject.list.size() == 0) {
                System.out.println("wait begin treadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("wait end threadName=" + Thread.currentThread().getName());
            }
            ValueObject.list.remove(0);
            System.out.println("list size=" + ValueObject.list.size());
        }
    }
}
