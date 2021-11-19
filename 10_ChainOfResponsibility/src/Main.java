import handler.ChiefExecutiveOfficer;
import handler.HeadOfUnitRPower;
import handler.ImmediateSupervisorRPower;
import handler.RaiseRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ImmediateSupervisorRPower immediateSupervisor = new ImmediateSupervisorRPower();
        HeadOfUnitRPower headOfUnit = new HeadOfUnitRPower();
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();

        immediateSupervisor.setSuccessor(headOfUnit);
        headOfUnit.setSuccessor(ceo);

        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your raise (Decimal form)");
                System.out.print("> ");
                double amount = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                immediateSupervisor.processRequest(new RaiseRequest(amount));
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
