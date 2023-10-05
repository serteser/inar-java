package week_07.live_class;

public class PassingArraysToMethods {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 89, 5, 44};
        printArray(array);
        System.out.println();
        printArray(new int[]{12, 4, 13, 9, 1, 3});
        System.out.println();
        printArray(new int[]{1});
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
