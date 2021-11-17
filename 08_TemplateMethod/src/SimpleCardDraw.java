import cards.Card;
import cards.Deck;

public class SimpleCardDraw extends Game {
    Deck deck = new Deck();
    Card winnerCard;
    int currentPlayer;
    boolean gameEnded = false;

    @Override
    void initializeGame() {
        deck.shuffle();
        winnerCard = deck.randomCard();
        System.out.println("First player to draw " + winnerCard.getSuit() + " " + winnerCard.getRank() + " wins!");
    }

    @Override
    void makePlay(int player) {
        currentPlayer = player;
        Card playerCard = deck.randomCard();
        System.out.println("Player " + currentPlayer + " got: " + playerCard.getSuit() + " " + playerCard.getRank());
        if (playerCard.getSuit() == winnerCard.getSuit() && playerCard.getRank() == winnerCard.getRank()) {
            printWinner();
            gameEnded = true;
        } else {
            deck.removeCard(playerCard);
        }

    }

    @Override
    boolean endOfGame() {
        return gameEnded;
    }

    @Override
    void printWinner() {
        System.out.println("\nPlayer " + currentPlayer + " won the game!");
    }
}
