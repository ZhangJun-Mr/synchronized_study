package sync.t9;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {
    private List list = new ArrayList(10);

    synchronized public void add(String username) {
        list.add(username);
    }

    synchronized public int getSize() {
        return list.size();
    }
}
