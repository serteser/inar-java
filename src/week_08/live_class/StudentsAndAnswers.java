package week_08.live_class;

import java.util.Scanner;

public class StudentsAndAnswers {
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
        for (int i = 0; i < row; i++) {
            s = input.nextLine();
        }

        char[] chBeforeCast = new char[2 * column - 1];
        for (int i = 0; i < chBeforeCast.length; i++) {
            //s = input.next();
            chBeforeCast[i] = s.charAt(i);

        }
        char[] chAfterCast = new char[column];
        int count = 0;

        int z=0;
        char[][] answers = new char[row][column];
        do {
            for (int i = 0; i < chBeforeCast.length; i++) {
                if (chBeforeCast[i] == ' ') {
                    continue;
                } else {
                    chAfterCast[count] = chBeforeCast[i];
                    count++;
                }
            }

            answers[z] = chAfterCast;
            z++;
            break;
        }while (z==8);


//        for (row = 0; row < answers.length; row++) {
//
//            for (column = 0; column < answers[0].length; column++) {
//                answers[row][column] = chAfterCast[column];
//            }
//
//        }

        return answers;
    }
}
