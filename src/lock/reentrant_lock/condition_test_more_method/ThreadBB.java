package lock.reentrant_lock.condition_test_more_method;

public class ThreadBB extends Thread {
    private Myservice myservice;

    public ThreadBB(Myservice myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.methodB();
    }
}
