package week_06.assignments;

public class Question_06_32 {
    public static void main(String[] args) {
        int countWinningGames = 0;


        for (int i = 1; i <= 5; i++) {
            int dice1 = (int) (1 + Math.random() * 6);
            int dice2 = (int) (1 + Math.random() * 6);
            int sumOfDice = dice1 + dice2;
            if (sumOfDice == 7 || sumOfDice == 11) {
                System.out.printf("You rolled %d + %d = %d \nYou win\n", dice1, dice2, (dice1 + dice2));
                countWinningGames++;
            } else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
                System.out.printf("You rolled %d + %d = %d \nYou lose\n", dice1, dice2, (dice1 + dice2));
            } else if (sumOfDice == 4 || sumOfDice == 5 || sumOfDice == 6 || sumOfDice == 8 || sumOfDice == 9 || sumOfDice == 10) {
                System.out.printf("You rolled %d + %d = %d \npoint is %d\n", dice1, dice2, (dice1 + dice2), sumOfDice);
                int sumOfDiceLast = sumOfDice;
                while (sumOfDice != 7 || sumOfDice != sumOfDiceLast) {
                    dice1 = (int) (1 + Math.random() * 6);
                    dice2 = (int) (1 + Math.random() * 6);
                    sumOfDice = dice1 + dice2;

                    if (sumOfDice == 7) {
                        System.out.printf("You rolled %d + %d = %d \nYou lose", dice1, dice2, (dice1 + dice2));
                        System.out.println();
                        break;
                    } else if (sumOfDice == sumOfDiceLast) {
                        System.out.printf("You rolled %d + %d = %d \nYou win", dice1, dice2, (dice1 + dice2));
                        countWinningGames++;
                        System.out.println();
                        break;
                    }
                    System.out.printf("You rolled %d + %d = %d \n", dice1, dice2, (dice1 + dice2));


                }
            }
        }
        System.out.println("Number of winning games: " + countWinningGames);
    }
}
