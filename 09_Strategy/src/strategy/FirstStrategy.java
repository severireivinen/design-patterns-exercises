package strategy;

import java.util.Iterator;
import java.util.List;

public class FirstStrategy implements ListConverter {

    @Override
    public String listToString(List list) {
        Iterator<String> iterator = list.iterator();
        StringBuilder sb = new StringBuilder();

        while (iterator.hasNext()) {
            sb.append(iterator.next() + "\n");
        }
        return sb.toString();
    }
}
