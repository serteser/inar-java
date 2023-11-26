package week_12.live_class;
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner("12 12");
        int sum = input.nextInt() + input.nextInt();
        System.out.println("Sum is " + sum);
    }
}
