package handler;

public class ChiefExecutiveOfficer extends RaisePower {

    public void processRequest(RaiseRequest request) {
        System.out.println("CEO will approve a raise of " + request.getAmount() * 100 + "%");
    }
}
