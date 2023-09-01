package week_03.assignments;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int outputOfRandom = (int) (Math.random() * 3);
        System.out.print("Enter a number according to given; scissor(0), rock(1), paper(2) : ");
        int inputOfUser = input.nextInt();

        if (inputOfUser == 0 && outputOfRandom == 2) {
            System.out.println("The computer is paper. You are scissor. You won.");
        } else if (inputOfUser == 1 && outputOfRandom == 0) {
            System.out.println("The computer is scissor. You are rock. You won.");
        } else if (inputOfUser == 2 && outputOfRandom == 1) {
            System.out.println("The computer is rock. You are paper. You won.");
        }

        if (inputOfUser == 0 && outputOfRandom == 1) {
            System.out.println("The computer is rock. You are scissor. You lose.");
        } else if (inputOfUser == 1 && outputOfRandom == 2) {
            System.out.println("The computer is paper. You are rock. You lose.");
        } else if (inputOfUser == 2 && outputOfRandom == 0) {
            System.out.println("The computer is scissor. You are paper. You lose.");
        }

        if (inputOfUser == 0 && outputOfRandom == 0) {
            System.out.println("The computer is scissor. You are scissor too. It is a draw.");
        } else if (inputOfUser == 1 && outputOfRandom == 1) {
            System.out.println("The computer is rock. You are rock too. It is a draw.");
        } else if (inputOfUser == 2 && outputOfRandom == 2) {
            System.out.println("The computer is paper. You are paper too. It is a draw.");
        }

    }
}
