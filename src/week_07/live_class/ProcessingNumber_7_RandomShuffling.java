package week_07.live_class;

public class ProcessingNumber_7_RandomShuffling {
    public static void main(String[] args) {
        int[] vegetables = {36, 60, 23, 24, 29, 3, 64, 10, 58, 44, 101};
        for (int i = 0; i <vegetables.length ; i++) {
            System.out.print(vegetables[i] + " ");
        }

        System.out.println();

        for (int i = vegetables.length-1; i >= 0 ; i--) {
            int j = (int) (Math.random() * (i+1));
            int temp = vegetables[i];
            vegetables[i] = vegetables[j];
            vegetables[j] = temp;
            System.out.print(vegetables[i] + " ");
        }


    }
}
