package week_08.assignments;
public class Question_08_03 {
    public static void main(String[] args) {

        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Create an array to make the grades sorted
        int[] forSorting = new int[answers.length];

        // Grade all answers
        for (int row = 0; row < answers.length; row++) {

            // Grade one student
            int correctCount = 0;
            for (int column = 0; column < answers[0].length; column++) {
                if (answers[row][column] == key[column]) {
                    correctCount++;
                }
            }
            forSorting[row] = correctCount; // Hold the correct answers in an array
        }

        // Copy the array to see the students' correct answers, after sorting the initial array
        int[] beforeSorting = new int[forSorting.length];
        System.arraycopy(forSorting, 0, beforeSorting, 0, forSorting.length);

        // Sort the grades and display the result
        for (int i = 0; i < forSorting.length; i++) {
            int minGrade = forSorting[i];
            int minGradeIndex = i;
            int count = 0;
            int k = 0;
            for (int j = i + 1; j < forSorting.length; j++) {
                if (minGrade > forSorting[j]) {
                    minGrade = forSorting[j];
                    minGradeIndex = j;
                }
            }
            if (minGradeIndex != i) {
                ++count;
                forSorting[minGradeIndex] = forSorting[i];
                forSorting[i] = minGrade;
            } else {
                int temp = 0;
                for (k = 0; k < forSorting.length; k++) {
                    if (beforeSorting[k] == forSorting[i]) {
                        temp = i;
                        i = k;
                        break;
                    }
                }
                i = temp;
            }
            System.out.printf("Student %d's correct count is %d\n", (count == 0 ? k : minGradeIndex), minGrade);
        }


    }


}
