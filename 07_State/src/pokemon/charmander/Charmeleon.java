package pokemon.charmander;

import pokemon.PokemonState;

import java.util.Random;

public class Charmeleon implements PokemonState {
    private static Charmeleon INSTANCE = null;
    private Random random = new Random();
    private String name;
    int experience;
    private int def;
    private int att;

    private Charmeleon() {
        name = "Charmeleon";
        experience = 0;
        def = 33;
        att = 45;
    }

    public static Charmeleon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmeleon();
        }
        return INSTANCE;
    }

    @Override
    public int gainExperience() {
        int max = 120;
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
        System.out.println("Basic abilities");
    }
}
