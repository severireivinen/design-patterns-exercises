package pokemon.charmander;

import pokemon.PokemonState;

public class CharmanderTrainer {
    private PokemonState pokemonState;
    private int gainedExperience;

    public CharmanderTrainer() {
        pokemonState = Charmander.getInstance();
        gainedExperience = pokemonState.getExperience();
    }

    public void train() {
        System.out.println("Currently training: " + pokemonState.getName());
        gainedExperience += pokemonState.gainExperience();
        tryEvolving();
    }

    public void pokemonInfo() {
        pokemonState.getStats();
        pokemonState.getAbilities();
    }

    private void tryEvolving() {
        if (pokemonState == Charmander.getInstance() && gainedExperience > 200) {
            System.out.println(pokemonState.getName() + " has evolved!");
            pokemonState = Charmeleon.getInstance();
            gainedExperience = pokemonState.getExperience();
        } else if (pokemonState == Charmeleon.getInstance() && gainedExperience > 500) {
            System.out.println(pokemonState.getName() + " has evolved!");
            pokemonState = Charizard.getInstance();
            gainedExperience = pokemonState.getExperience();
        } else {
            System.out.println(pokemonState.getName() + " has gained a total of " + gainedExperience + " experience.");
        }
    }
}
