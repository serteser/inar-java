package week_07.live_class;

public class ProcessingNumber_2_InitializingArraysWithRandomValues {
    public static void main(String[] args) {
        double[] bike = new double[10];
        for (int i = 0; i < bike.length; i++) {
            bike[i] = Math.random() * 100;
            System.out.println( (i) + "==> " + bike[i]);
        }
    }
}
