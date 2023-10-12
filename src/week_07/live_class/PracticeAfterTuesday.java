package week_07.live_class;

import java.util.Arrays;

public class PracticeAfterTuesday {
    public static void main(String[] args) {
        int[] practiceArray = {5, 4, 3, 18, 25, 32, 45};
        System.out.println(Arrays.toString(sortingNumbersByDivisors(practiceArray)));
    }
    public static int[] sortingNumbersByDivisors(int[] array){
        int[] numberDeviseByThree = new int[array.length];
        int[] numbersDeviseByAll = new int[array.length];
        int StartingIndexOfThree =0;
        int indexForTwo =0;
        int indexForThree=0;
        int indexForFive= array.length-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%5==0){
                numbersDeviseByAll[indexForFive]=array[i];
                indexForFive--;
            } else if (array[i]%3==0) {
                numberDeviseByThree[indexForThree]=array[i];
                indexForThree++;
            }else{
                numbersDeviseByAll[indexForTwo]=array[i];
                indexForTwo++;
                StartingIndexOfThree++;
            }
        }
        for (int i = 0; i < numbersDeviseByAll.length; i++) {
            if(i==StartingIndexOfThree){
                for (int j = 0; j <2 ; j++,i++) {
                    numbersDeviseByAll[i]=numberDeviseByThree[j];

                }
            }
        }
        return numbersDeviseByAll;
    }


}
