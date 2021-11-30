package builder;

import ingredients.Beef;
import ingredients.Cheese;
import ingredients.Salad;
import ingredients.Tomato;

import java.util.ArrayList;
import java.util.List;

public class HesburgerBuilder implements HamburgerBuilder {

    private List ingredients;

    @Override
    public void createNewBurgerProduct() {
        ingredients = new ArrayList();
        ingredients.add(new Beef());
        ingredients.add(new Cheese());
        ingredients.add(new Salad());
        ingredients.add(new Tomato());
    }

    @Override
    public List getBurger() {
        return ingredients;
    }
}
