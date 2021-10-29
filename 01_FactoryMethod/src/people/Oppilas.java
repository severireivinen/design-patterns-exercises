package people;

import abstracts.AterioivaOtus;
import drinks.Olut;
import foods.Nuudeli;
import interfaces.Juoma;
import interfaces.Ruoka;

public class Oppilas extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Olut();
    }

    @Override
    public Ruoka createRuoka() {
        return new Nuudeli();
    }
}
