package week_06.assignments;

public class Question_06_30 {
    public static void main(String[] args) {

        int dice1 = (int) (1 + Math.random() * 6);
        int dice2 = (int) (1 + Math.random() * 6);

        int sumOfDice = dice1 + dice2;
        if (sumOfDice == 7 || sumOfDice == 11) {
            System.out.printf("You rolled %d + %d = %d \nYou win", dice1, dice2, (dice1 + dice2));

        } else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
            System.out.printf("You rolled %d + %d = %d \nYou lose", dice1, dice2, (dice1 + dice2));

        } else if (sumOfDice == 4 || sumOfDice == 5 || sumOfDice == 6 || sumOfDice == 8 || sumOfDice == 9 || sumOfDice == 10) {
            System.out.printf("You rolled %d + %d = %d \npoint is %d", dice1, dice2, (dice1 + dice2), sumOfDice);

            int sumOfDiceLast = sumOfDice;
            System.out.println();
            while (sumOfDice != 7 || sumOfDice != sumOfDiceLast) {
                dice1 = (int) (1 + Math.random() * 6);
                dice2 = (int) (1 + Math.random() * 6);
                sumOfDice = dice1 + dice2;

                if (sumOfDice == 7) {
                    System.out.printf("You rolled %d + %d = %d \nYou lose", dice1, dice2, (dice1 + dice2));
                    break;
                } else if (sumOfDice == sumOfDiceLast) {
                    System.out.printf("You rolled %d + %d = %d \nYou win", dice1, dice2, (dice1 + dice2));
                    break;
                }
                System.out.printf("You rolled %d + %d = %d \n", dice1, dice2, (dice1 + dice2));

            }
        }


    }
}
