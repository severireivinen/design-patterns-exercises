package strategy;

import java.util.List;

public class ThirdStrategy implements ListConverter {

    @Override
    public String listToString(List list) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if ((i + 1) % 3 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
