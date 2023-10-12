package week_07.live_class;

public class LiveClass1 {
    public static void main(String[] args) {
        //You are given a non-empty array, return true if there is a
        // place to split the array so that the sum of the numbers on one side is equal to 	the sum of the numbers on the other side.
        // {1,2,0,2,3,2 }

        int[] array1 = {1,2,0,2,3,2} ;
        System.out.println(isEqual(array1));
        int[] array2 = {2} ;
        System.out.println(isEqual(array2));
        int[] array3 = {0,0,0,0,0,0} ;
        System.out.println(isEqual(array3));
        int[] array4 = {1,2,0,2,3,2} ;
        System.out.println(isEqual(array4));
        int[] array5 = {1,2,3,4,5,6} ;
        System.out.println(isEqual(array5));
        int[] array6 = {3,3,3,3,3,3} ;
        System.out.println(isEqual(array6));


    }

    public static boolean isEqual(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            int sumOfFirstPart = 0;
            for (int j = 0; j <= i ; j++) {
                sumOfFirstPart += array[j];
            }

            int sumOfLastPart = 0;

            for (int k = i + 1; k < array.length; k++) {
                sumOfLastPart += array[k];
            }
            if (sumOfFirstPart == sumOfLastPart) {
                return true;
            }

        }
        return false;
    }

}
