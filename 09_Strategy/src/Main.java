import strategy.FirstStrategy;
import strategy.ListConverter;
import strategy.SecondStrategy;
import strategy.ThirdStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ListConverter converter = new FirstStrategy();

        // Fill list
        for (int i = 0; i < 10; i++) {
            list.add("Test");
        }

        System.out.println("After every element");
        System.out.println(converter.listToString(list));

        System.out.println("\nAfter every second element");
        converter = new SecondStrategy();
        System.out.println(converter.listToString(list));

        System.out.println("\nAfter every third element");
        converter = new ThirdStrategy();
        System.out.println(converter.listToString(list));
    }
}
