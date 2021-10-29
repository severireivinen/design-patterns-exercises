package people;

import abstracts.AterioivaOtus;
import drinks.Mehu;
import foods.Pizza;
import interfaces.Juoma;
import interfaces.Ruoka;

public class KeittioTati extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Mehu();
    }

    @Override
    public Ruoka createRuoka() {
        return new Pizza();
    }
}
