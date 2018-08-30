package lock.reentrant_lock.condition_test_more_method;

public class Run {
    public static void main(String[] args) {
        Myservice myservice = new Myservice();
        ThreadA threadA = new ThreadA(myservice);
        threadA.setName("A");
        threadA.start();

        ThreadAA threadAA = new ThreadAA(myservice);
        threadAA.setName("AA");
        threadAA.start();

        ThreadB threadB = new ThreadB(myservice);
        threadB.setName("B");
        threadB.start();

        ThreadBB threadBB = new ThreadBB(myservice);
        threadBB.setName("BB");
        threadBB.start();
    }
}
