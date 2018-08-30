package sync.sync_out_asyn;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList(10);

    synchronized public void add(String username) {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了add方法！");
        list.add(username);
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了add方法！");
    }

    synchronized public int getSize() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了getsize方法！");
        int sizeValue = list.size();
        return sizeValue;
    }
}
