package lock.reentrant_lock.user_condition_wait_notify_ok;


public class ThreadA extends Thread {

    private MyService myservice = new MyService();

    public ThreadA(MyService myservice) {
        this.myservice = myservice;
    }

    @Override
    public void run() {
        myservice.await();
    }
}
