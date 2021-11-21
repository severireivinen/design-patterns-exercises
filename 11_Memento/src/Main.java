import memento.Customer;
import memento.Puzzler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Puzzler puzzler = new Puzzler();

        List<Customer> guessers = new ArrayList<>();
        guessers.add(new Customer("John", puzzler));
        guessers.add(new Customer("Jake", puzzler));
        guessers.add(new Customer("Simon", puzzler));

        for (Customer c : guessers) {
            c.start();
        }
        for (Customer c : guessers) {
            c.join();
        }
    }
}
