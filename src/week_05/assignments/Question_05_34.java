package week_05.assignments;

import java.util.Scanner;

public class Question_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerScore = 0;
        int userScore = 0;
        int computerWinCount = 0;
        int userWinCount = 0;

        for (int i = 1; computerScore == userScore; i++) {
            System.out.print("scissor(0), rock(1), paper(2) : ");
            //System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
            int computerNumber = (int) (Math.random() * 3);

            if (computerNumber == 0) {
                if (userNumber == 0) {
                    System.out.print("The computer is scissor. You are scissor too, It is a draw.\n");
                }
                if (userNumber == 1) {
                    System.out.print("The computer is scissor. You are rock. You won.\n");
                    userWinCount++;
                }
                if (userNumber == 2) {
                    System.out.print("The computer is scissor. You are paper. You lose.\n");
                    computerWinCount++;
                }
            }
            if (computerNumber == 1) {
                if (userNumber == 0) {
                    System.out.print("The computer is rock. You are scissor. You lose.\n");
                    computerWinCount++;
                }
                if (userNumber == 1) {
                    System.out.print("The computer is rock. You are rock too, It is a draw.\n");
                }
                if (userNumber == 2) {
                    System.out.print("The computer is rock. You are paper. You won.\n");
                    userWinCount++;
                }
            }
            if (computerNumber == 2) {
                if (userNumber == 0) {
                    System.out.print("The computer is paper. You are scissor. You won.\n");
                    userWinCount++;
                }
                if (userNumber == 1) {
                    System.out.print("The computer is paper. You are rock. You lose.\n");
                    computerWinCount++;
                }
                if (userNumber == 2) {
                    System.out.print("The computer is paper. You are paper too, It is a draw.\n");
                }
            }
            System.out.println("Computer Wins: " + computerWinCount);
            System.out.println("User Wins: " + userWinCount);

            if (Math.abs(computerWinCount - userWinCount) == 2) {
                computerScore = computerWinCount;
                userScore = userWinCount;
                System.out.println("\"Game Over\"");
            }
        }


    }
}
