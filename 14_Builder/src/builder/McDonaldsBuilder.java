package builder;

public class McDonaldsBuilder implements HamburgerBuilder {

    private StringBuilder sb;

    @Override
    public void createNewBurgerProduct() {
        sb = new StringBuilder();
        sb.append("Beef ");
        sb.append("Cheese ");
        sb.append("Salad ");
        sb.append("Tomato");
    }

    @Override
    public Object getBurger() {
        return sb;
    }

}
