package handler;

public abstract class RaisePower {
    protected static final double BASE = 0.02;
    private RaisePower successor;

    public void setSuccessor(RaisePower successor) {
        this.successor = successor;
    }

    public void processRequest(RaiseRequest request) {
        if (successor != null) {
            successor.processRequest(request);
        }
    }
}
