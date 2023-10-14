package week_08.assignments;

import java.util.Scanner;

public class Question_08_03 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("Enter the answers that eight  students have given to ten questions, as a 8-by-10 matrix row by row: ");
        char[][] answersOfStudents = getArray(8, 10);
        //displayResultsOfExam(answersOfStudents, key);
        for (int row = 0; row < answersOfStudents.length; row++) {
            for (int column = 0; column < answersOfStudents[0].length; column++) {
                System.out.print(answersOfStudents[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] getArray(int row, int column) {
        Scanner input = new Scanner(System.in);


        String s = "";
        char[] ch1 = new char[10];
        for (int i = 0; i < ch1.length; i++) {
            s = input.nextLine();
            ch1[i] = s.charAt(i);

        }
        char[][] answers = new char[row][column];
        for (row = 0; row < answers.length; row++) {
            for (column = 0; column < answers[0].length; column++) {
                answers[row][column] = ch1[column];
            }
        }

        return answers;
    }
}
