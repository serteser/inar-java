package week_07.assignments;

import java.util.Arrays;

public class Question_07_24 {
    public static void main(String[] args) {

        // Initialize the cards
        int[] deck = new int[52];
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Shuffle the cards in random order
        for (int i = deck.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        // Pick the cards in appropriate manner and hold them in an array
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

        // Display the four cards and number of pick
        for (int i = 0; i < holdSuitsValues.length; i++) {
            String suit = suits[holdSuitsValues[i] / 13];
            String rank = ranks[holdSuitsValues[i] % 13];
            System.out.println(rank + " of " + suit);
        }
        System.out.print("Number of picks: " + countOfPickingCards);

    }
}
