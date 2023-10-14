package week_07.live_class;

public class StackOverFlow {
    public static void main(String[] args){
        int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

        for (int i = 0; i < solutionArray.length; i++)
        {
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println();

        for (int i = solutionArray.length - 1; i >= 0; i--) {
            int index = (int) (Math.random() * (i + 1));

            int temp = solutionArray[index];
            solutionArray[index] = solutionArray[i];
            solutionArray[i] = temp;

            System.out.print(solutionArray[i] + " ");
        }




    }



}
