package week_07.live_class;

import java.util.Arrays;

public class PracticeOnTuesday1 {
    public static void main(String[] args) {
        int[] testArrayOne = {1, 0, 1, 0, 0, 1, 1}; //[0, 0, 0, 1, 1, 1, 1]
        int[] testArrayTwo = {3, 3, 2}; // [2, 3, 3]
        int[] testArrayThree = {2, 2, 2}; // [2, 2, 2]
        int[] testArrayFour = {1}; // 	[1]
        int[] testArrayFive = {1,2}; // [2, 1]
        System.out.println(Arrays.toString(evenOddInSameArray(testArrayOne)));
        System.out.println(Arrays.toString(evenOddInSameArray(testArrayTwo)));
        System.out.println(Arrays.toString(evenOddInSameArray(testArrayThree)));
        System.out.println(Arrays.toString(evenOddInSameArray(testArrayFour)));
        System.out.println(Arrays.toString(evenOddInSameArray(testArrayFive)));
        System.out.println("***************************************************");
        System.out.println(Arrays.toString(evenOddInOtherArray(testArrayOne)));
        System.out.println(Arrays.toString(evenOddInOtherArray(testArrayTwo)));
        System.out.println(Arrays.toString(evenOddInOtherArray(testArrayThree)));
        System.out.println(Arrays.toString(evenOddInOtherArray(testArrayFour)));
        System.out.println(Arrays.toString(evenOddInOtherArray(testArrayFive)));

    }
    public static int[] evenOddInSameArray(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                for (int j = i+1; j < array.length ; j++) {
                    if(array[j]%2==0){
                       temp = array[i];
                       array[i]=array[j];
                        array[j]=temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
    public static int[] evenOddInOtherArray(int[] array){
        int[] result = new int[array.length];
        int evenIndex=0;
        int oddIndex=array.length-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                result[evenIndex]=array[i];
                evenIndex++;
            }else{
                result[oddIndex]=array[i];
                oddIndex--;
            }
        }
        return result;
    }
}
