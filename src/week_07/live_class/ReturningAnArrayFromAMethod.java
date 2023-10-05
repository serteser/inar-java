package week_07.live_class;

public class ReturningAnArrayFromAMethod {
    public static void main(String[] args) {
        int[] array = {46,22,44,88};
        int[] reverseArray = reverse(array);

        for (int j : reverseArray) {
            System.out.print(j + " ");
        }
    }
    public static int[] reverse(int[] array){
        int[] reverse = new int[array.length];
        for (int i = 0, j = reverse.length-1; i < array.length; i++, j--) {
            reverse[j]=array[i];
        }
        return reverse;
    }


}
