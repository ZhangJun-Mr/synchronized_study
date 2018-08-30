package sync.waitOld;

public class Add {
    private final String lock;
    public Add(String lock){
        super();
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
