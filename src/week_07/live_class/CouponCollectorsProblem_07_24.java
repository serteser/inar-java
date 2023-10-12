package week_07.live_class;

import java.util.Arrays;

public class CouponCollectorsProblem_07_24 {
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
        for (int i = 0; i < 52; i++) {
            System.out.print(deck[i] + " ");
        }
        System.out.println();

        boolean isGameOver = false;

        int[] holdSuitsValues = new int[4];
        int countOfPickingCards = 0;

        while (!isGameOver) {
            Arrays.fill(holdSuitsValues, 0);
            int countsOfSpades = 0;
            int countsOfClubs = 0;
            int countsOfDiamonds = 0;
            int countsOfHearts = 0;
            int i;
            for (i = 0; i < 4; i++) {

                int indexOfCard = (int) (Math.random() * 52);
                System.out.println("indexOfCard==>" + indexOfCard);
                countOfPickingCards++;

                if (indexOfCard / 13 == 0) {
                    holdSuitsValues[0] = indexOfCard;
                    countsOfSpades++;
                    if (countsOfSpades == 2) {
                        break;
                    }
                } else if (indexOfCard / 13 == 1) {
                    holdSuitsValues[1] = indexOfCard;
                    countsOfClubs++;
                    if (countsOfClubs == 2) {
                        break;
                    }
                } else if (indexOfCard / 13 == 2) {
                    holdSuitsValues[2] = indexOfCard;
                    countsOfDiamonds++;
                    if (countsOfDiamonds == 2) {
                        break;
                    }
                } else if (indexOfCard / 13 == 3) {
                    holdSuitsValues[3] = indexOfCard;
                    countsOfHearts++;
                    if (countsOfHearts == 2) {
                        break;
                    }
                }
            }
            if (i == 4) {
                isGameOver = true;
            }

        }
        for (int i = 0; i < holdSuitsValues.length; i++) {
            System.out.print(holdSuitsValues[i] + " ");
        }
        System.out.println();
        System.out.println("countOfPickingCards==>" + countOfPickingCards);

        // display the four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }


    }

    public static boolean isTaskOver(int spades, int clubs, int diamonds, int hearts) {
        return (spades == 1 && clubs == 1 && diamonds == 1 && hearts == 1);
    }
}
