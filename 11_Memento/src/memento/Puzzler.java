package memento;

public class Puzzler {

    public void joinGame(Customer customer) {
        customer.getMementoNum(new Memento((int) (Math.random() * 5)));
    }

    public void checkGuess(Customer customer, int guess) {
        Memento correctNum = (Memento) customer.passMemento();

        if (correctNum.number == guess) {
            System.out.println(customer.getCustomerName() + " guessed right!");
            customer.setIsCorrect();
        } else {
            System.out.println(customer.getCustomerName() + " guess was wrong");
        }
    }


    private class Memento {
        private int number;

        public Memento(int number) {
            this.number = number;
        }
    }
}
