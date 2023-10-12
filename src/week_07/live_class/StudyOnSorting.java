package week_07.live_class;

public class StudyOnSorting {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean isSorted = true;
        while (isSorted) {
            int count=0;
            for (int i = 0; i < array.length - 1; i++) {
                int currentMin = array[i];
                int currentMinIndex = i;
                if (currentMin > array[i + 1]) {
                    array[currentMinIndex] = array[i + 1];
                    array[i + 1] = currentMin;
                    isSorted = true;
                    count++;
                }
            }
            if(count==0){
                isSorted=false;
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
