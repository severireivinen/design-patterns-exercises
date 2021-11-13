import pokemon.charmander.CharmanderTrainer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        CharmanderTrainer trainer = new CharmanderTrainer();

        while (true) {
            trainer.pokemonInfo();
            trainer.train();
            System.out.print("\n");
            Thread.sleep(2000);
        }
    }
}
