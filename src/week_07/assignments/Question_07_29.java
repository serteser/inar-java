package week_07.assignments;

import java.util.Arrays;

public class Question_07_29 {
    public static void main(String[] args) {
        // Initialize the cards
        int[] deck = new int[52];
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        boolean isSumRight = false;
        int[] arrayOfPickingCards = new int[4];
        while (!isSumRight) {
            Arrays.fill(arrayOfPickingCards, 0);
            int i ;
            int sum = 0;
            for (i = 0; i < arrayOfPickingCards.length; i++) {

                int cardNumber = (int) (Math.random() * 52);
                arrayOfPickingCards[i] = (cardNumber % 13) + 1;
                sum += arrayOfPickingCards[i];
                if (sum == 24 && i == 3) {
                    isSumRight = true;
                }
            }

        }
        System.out.print("The number of picks that yields the sum of 24: ");
        for (int i = 0; i < arrayOfPickingCards.length; i++) {

            String rank = ranks[arrayOfPickingCards[i] - 1];
            System.out.print(rank + " ");
        }

    }
}
