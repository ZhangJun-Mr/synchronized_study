package sync.sync_out_asyn;

public class MyThreadA extends Thread {
    private MyList list;

    public MyThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 10000; i++) {
            list.add("threadA" + (i + 1));
        }
    }
}
