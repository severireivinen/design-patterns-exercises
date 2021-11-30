package builder;

public class Foodora {
    private HamburgerBuilder hamburgerBuilder;

    public void setHamburgerBuilder(HamburgerBuilder hb) {
        this.hamburgerBuilder = hb;
    }

    public void constructOrder() {
        hamburgerBuilder.createNewBurgerProduct();
    }
}
