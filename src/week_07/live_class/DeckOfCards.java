package week_07.live_class;

public class DeckOfCards {
    public static void main(String[] args) {
        // initialize the cards
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
            System.out.print(deck[i] + " ");
        }
        System.out.println();
        // shuffle the cards in random order
        for (int i = deck.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        // display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits [deck[i]/13];
            String rank = ranks [deck[i]%13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }


}
