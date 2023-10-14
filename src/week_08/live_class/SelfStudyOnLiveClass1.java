package week_08.live_class;

public class SelfStudyOnLiveClass1 {
    public static void main(String[] args) {
        //You are given a non-empty array, return true if there is a
        // place to split the array so that the sum of the numbers on one side is equal to 	the sum of the numbers on the other side.
        // {1,2,0,2,3,2 }

        int[] array1 = {1, 2, 0, 2, 3, 2};      // true
        System.out.println(isEqual(array1));
        int[] array2 = {2};                     // false
        System.out.println(isEqual(array2));
        int[] array3 = {0, 0, 0, 0, 0, 0};      // true
        System.out.println(isEqual(array3));
        int[] array4 = {1, 2, 0, 2, 3, 2};      // true
        System.out.println(isEqual(array4));
        int[] array5 = {1, 2, 3, 4, 5, 6};      // false
        System.out.println(isEqual(array5));
        int[] array6 = {3, 3, 3, 3, 3, 3};      // true
        System.out.println(isEqual(array6));
    }

    public static boolean isEqual(int[] array) {
        if(array.length==1){
            return false;
        }
        boolean isEqual=false;
        int k =0;
        while(!isEqual){

            if(k==(array.length-1)){
                break;
            }

            int sumOfFirstPart = 0;
            for (int i = 0;  i<=k ; i++) {
                sumOfFirstPart += array[i];
            }

            int sumOfSecondPart = 0;
            for (int j = array.length-1; k< j; j--) {
                sumOfSecondPart += array[j];
            }

            if (sumOfFirstPart==sumOfSecondPart){

                return true;
            }

            k++;
        }
        return false;
    }

}
