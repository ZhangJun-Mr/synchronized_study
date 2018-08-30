package lock.reentrant_lock.condition_test_more_method;

public class ThreadAA extends Thread {
    private Myservice myservice;

    public ThreadAA(Myservice myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.methodA();
    }
}
