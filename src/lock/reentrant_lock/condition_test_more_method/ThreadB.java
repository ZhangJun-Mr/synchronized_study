package lock.reentrant_lock.condition_test_more_method;

public class ThreadB extends Thread {
    private Myservice myservice;

    public ThreadB(Myservice myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.methodB();
    }
}
