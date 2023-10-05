package week_07.live_class;

public class Test {
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
        // shuffle the cards and display them in odd(mix) order, with using shuffle method
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            System.out.print(deck[i] + " ");
        }
        System.out.println();
        // display the first four cards
        for (int i = 0; i < 4; i++) {
            System.out.print(deck[i] + " ");
        }
    }
}
