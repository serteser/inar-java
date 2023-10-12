package week_07.live_class;

public class VariableLengthArgumentLists {
    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[] {});
    }
    public static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);

    }
}
