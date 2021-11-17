package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (Suits s : Suits.values()) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(s, j);
                cards.add(card);
            }
        }
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card.getSuit() + " " + card.getRank());
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card randomCard() {
        return cards.get(new Random().nextInt(cards.size()));
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }
}
