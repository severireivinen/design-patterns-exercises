package pokemon.charmander;

import pokemon.PokemonState;

import java.util.Random;

public class Charmander implements PokemonState {
    private static Charmander INSTANCE = null;
    private Random random = new Random();
    private String name;
    int experience;
    private int def;
    private int att;

    private Charmander() {
        name = "Charmander";
        experience = 0;
        def = 5;
        att = 10;
    }

    public static Charmander getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmander();
        }
        return INSTANCE;
    }

    @Override
    public int gainExperience() {
        int max = 45;
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
        System.out.println("Starter abilities");
    }

}
