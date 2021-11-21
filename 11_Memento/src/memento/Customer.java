package memento;

public class Customer extends Thread {
    private Object mementoNum;
    private Puzzler puzzler;
    private String name;
    private boolean isCorrect;

    public Customer(String name, Puzzler puzzler) {
        this.name = name;
        this.puzzler = puzzler;
        isCorrect = false;
    }

    @Override
    public void run() {
        puzzler.joinGame(this);

        while (!isCorrect) {
            puzzler.checkGuess(this, (int) (Math.random() * 5));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void getMementoNum(Object mementoNum) {
        this.mementoNum = mementoNum;
    }

    public Object passMemento() {
        return mementoNum;
    }

    public String getCustomerName() {
        return name;
    }

    public void setIsCorrect() {
        this.isCorrect = true;
    }
}
