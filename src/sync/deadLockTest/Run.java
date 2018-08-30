package sync.deadLockTest;

public class Run {
    public static void main(String[] args){
        try {
            DealThred t1 = new DealThred();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(10);
            /*t1.setFlag("b");
            Thread thread2= new Thread(t1);
            thread2.start();*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
