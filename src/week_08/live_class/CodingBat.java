package week_08.live_class;

public class CodingBat {
    public int sum2(int[] nums) {
        int sum=0;
        if(nums.length>=2){
            for (int i = 0; i < 2; i++) {
                sum+=nums[i];
            }
            return sum;
        }else if(nums.length == 1){
            return nums[0];
        }
       return 0;
    }
    public int[] middleWay(int[] a, int[] b) {
        int[] newArray = new int[2];
        newArray[0]=a[1];
        newArray[1]=b[1];
        return newArray;
    }
}
