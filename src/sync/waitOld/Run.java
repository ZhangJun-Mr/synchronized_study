package sync.waitOld;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Add add = new Add(lock);
        Substract substract = new Substract(lock);

        ThreadSubtract threadSubtract = new ThreadSubtract(substract);
        threadSubtract.setName("subtractThread");
        threadSubtract.start();

        ThreadSubtract threadSubtract1 = new ThreadSubtract(substract);
        threadSubtract1.setName("subtract2Thread");
        threadSubtract1.start();

        Thread.sleep(1000);
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("addThread");
        threadAdd.start();
        threadAdd.join(1000);
        System.out.println("main end");
    }
}
