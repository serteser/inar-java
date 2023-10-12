package week_07.live_class;

public class BinarySearch {
    public static void main(String[] args) {
        int[] testList = {1,4,7,9,12,36,37,38,79,98};
        int[] test = {7};
        System.out.println(binarySearch(testList,42));
        //System.out.println(binarySearch(test,7));
    }
    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if(key<array[mid]){
                high = mid-1;
            }else if(key==array[mid]){
                return mid;
            }else{
                low = mid+1;
            }
        }
        return -low -1;
    }

}
