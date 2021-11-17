package cards;

public class Card {
    private Suits suit;
    private int rank;

    public Card(Suits suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
