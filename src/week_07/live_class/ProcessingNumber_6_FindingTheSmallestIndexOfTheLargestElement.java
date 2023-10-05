package week_07.live_class;

public class ProcessingNumber_6_FindingTheSmallestIndexOfTheLargestElement {
    public static void main(String[] args) {
        int[] myList = {1, 5, 3, 4, 5, 5};
        int max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }
        System.out.printf("Max number in myList array is %d and indexOfMax is %d ",max, indexOfMax);
    }
}
