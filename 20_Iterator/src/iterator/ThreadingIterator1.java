package iterator;

import java.util.Iterator;
import java.util.List;

public class ThreadingIterator1 extends Thread {

    List list;
    String name;

    public ThreadingIterator1(List list, String name) {
        this.list = list;
        this.name = name;
    }

    @Override
    public void run() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(name + " " + iterator.next());
        }
    }
}
