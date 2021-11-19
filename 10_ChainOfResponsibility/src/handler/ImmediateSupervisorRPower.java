package handler;

public class ImmediateSupervisorRPower extends RaisePower {
    private final double ALLOWABLE = RaisePower.BASE;

    public void processRequest(RaiseRequest request) {
        if (request.getAmount() <= ALLOWABLE) {
            System.out.println("Immediate Supervisor will approve a raise of " + request.getAmount() * 100 + "%");
        } else {
            super.processRequest(request);
        }
    }
}
