package week_06.live_class;

public class TestMax {
    public static void main(String[] args) {
        int i = 10;
        int j = -23;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    public static int max(int number1, int number2) {
        int result;
        if (number1 < number2) {
            result = number2;
        } else {
            result = number1;
        }
        return result;
    }
}
