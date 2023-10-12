package week_07.live_class;

public class SortingArrays {
    public static void main(String[] args) {
        int[] unsortedNumbers = {2, 9, 5, 4, 8, 1, 6};
        selectionSort(unsortedNumbers);
    }
    public static void selectionSort(int[] list){

        for (int i = 0; i < list.length-1; i++) {
                int currentMin = list[i];
                int currentMinIndex = i;
            for (int j = i+1; j < list.length ; j++) {
                if(currentMin>list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex!=i){
                list[currentMinIndex]= list[i];
                list[i] = currentMin;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

}
