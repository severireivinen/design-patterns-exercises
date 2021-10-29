package people;

import abstracts.AterioivaOtus;
import drinks.Vesi;
import foods.Burgeri;
import interfaces.Juoma;
import interfaces.Ruoka;

public class Opettaja extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Vesi();
    }

    @Override
    public Ruoka createRuoka() {
        return new Burgeri();
    }
}
