package iterator;

import java.util.List;
import java.util.Iterator;

public class ThreadingIterator2 extends Thread {

    List list;
    Iterator iterator;
    String name;

    public ThreadingIterator2(List list, Iterator iterator, String name) {
        this.list = list;
        this.iterator = iterator;
        this.name = name;
    }

    @Override
    public void run() {
        while (iterator.hasNext()) {
            System.out.println(name + " " + iterator.next());
        }
    }
}
