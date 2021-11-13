package pokemon.charmander;

import pokemon.PokemonState;

import java.util.Random;

public class Charizard implements PokemonState {
    private static Charizard INSTANCE = null;
    private Random random = new Random();
    private String name;
    int experience;
    private int def;
    private int att;

    private Charizard() {
        name = "Charizard";
        experience = 0;
        def = 143;
        att = 189;
    }

    public static Charizard getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charizard();
        }
        return INSTANCE;
    }

    @Override
    public int gainExperience() {
        int max = 260;
        int min = 3;
        int xp = random.nextInt(max - min + 1) + min;
        experience += xp;
        return xp;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getStats() {
        System.out.println("Attack: " + att + "\t\t" + "Defence: " + def);
    }

    @Override
    public void getAbilities() {
        System.out.println("Elite abilities");
    }
}
