package week_07.live_class;

public class CopyingArrays {
    public static void main(String[] args) {
        double[] sourceArray = {45, 8, 89, 32.7, 123.8, 1};
        double[] targetArray = new double[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
           targetArray[i] = sourceArray[i];
            System.out.print(targetArray[i] + " ");
        }

        System.out.println();

        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);
        for (int i = 0; i < targetArray.length; i++) {
            System.out.println(targetArray[i] + " ");
        }
    }
}
