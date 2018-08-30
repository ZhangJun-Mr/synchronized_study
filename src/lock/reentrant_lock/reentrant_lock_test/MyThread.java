package lock.reentrant_lock.reentrant_lock_test;

public class MyThread extends Thread {
    private MyService myService;

    MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
