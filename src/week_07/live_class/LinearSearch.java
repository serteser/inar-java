package week_07.live_class;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {23, 4, 89, 7, 12, 32, 56, 789};
        System.out.println(linearSearch(numbers, 321));
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
