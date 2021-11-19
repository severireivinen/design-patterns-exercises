package handler;

public class HeadOfUnitRPower extends RaisePower {
    private final double ALLOWABLE = RaisePower.BASE + 0.03;

    public void processRequest(RaiseRequest request) {
        if (request.getAmount() > RaisePower.BASE && ALLOWABLE > request.getAmount()) {
            System.out.println("Head of Unit will approve a raise of " + request.getAmount() * 100 + "%");
        } else {
            super.processRequest(request);
        }
    }
}
