package lock.reentrant_lock.condition_test_more_method;

public class ThreadA extends Thread {
    private Myservice myservice;

    public ThreadA(Myservice myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.methodA();
    }
}
