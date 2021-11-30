import builder.Foodora;
import builder.HamburgerBuilder;
import builder.HesburgerBuilder;
import builder.McDonaldsBuilder;

public class Main {
    public static void main(String[] args) {
        Foodora courier = new Foodora();
        Foodora courier2 = new Foodora();

        HamburgerBuilder hesburger = new HesburgerBuilder();
        HamburgerBuilder mcDonadls = new McDonaldsBuilder();

        courier.setHamburgerBuilder(hesburger);
        courier2.setHamburgerBuilder(mcDonadls);

        courier.constructOrder();
        courier2.constructOrder();

        System.out.println("Hesburger:");
        System.out.println(hesburger.getBurger());
        System.out.println("\n");
        System.out.println("McDonalds:");
        System.out.println(mcDonadls.getBurger());

    }
}
