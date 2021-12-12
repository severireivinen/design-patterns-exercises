import iterator.ThreadingIterator1;
import iterator.ThreadingIterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }

        // A
        System.out.println("Yritetään iteroida kokoelmaa kahdella säikeellä yhtä aikaa\n");
        ThreadingIterator1 ti1_1 = new ThreadingIterator1(list, "TI1_1");
        ThreadingIterator1 ti1_2 = new ThreadingIterator1(list, "TI1_2");
        ti1_1.start();
        ti1_2.start();

        // B
        System.out.println("Säikeet käyttävät samaa iteraattoria vuorotellen\n");
        Iterator iterator = list.iterator();
        ThreadingIterator2 ti2_1 = new ThreadingIterator2(list, iterator, "TI2_1");
        ThreadingIterator2 ti2_2 = new ThreadingIterator2(list, iterator, "TI2_2");
        ti2_1.start();
        ti2_2.start();

        // C
        System.out.println("Kokoelmaan tehdään muutoksia iteroinnin läpikäynnin aikana\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(666);  // Aiheuttaa virheen
        }

        System.out.println("Kokoelmasta yritetään poistaa iteroinnin aikana\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
