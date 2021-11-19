package strategy;

import java.util.List;

public class SecondStrategy implements ListConverter {

    @Override
    public String listToString(List list) {
        Object[] objects = list.toArray();
        StringBuilder sb = new StringBuilder();

        int i = 0;

        for (Object o : objects) {
            i++;
            sb.append(o);
            if (i % 2 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
