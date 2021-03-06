package sync.t9;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();

        MyThread1 myThread1 = new MyThread1(list);
        myThread1.setName("A");
        myThread1.start();

        MyThread2 myThread2 = new MyThread2(list);
        myThread2.setName("B");
        myThread2.start();
        Thread.sleep(2000);
        System.out.println("listSize=" + list.getSize());
    }
}
