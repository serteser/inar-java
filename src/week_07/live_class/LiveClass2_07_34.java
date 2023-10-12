package week_07.live_class;
import java.util.Scanner;
public class LiveClass2_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = input.nextLine();
        str = str.toLowerCase();
        String result = sort(str);
        System.out.println(result);
    }

    public static String sort(String str) {
        int[] result = new int[str.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (str.charAt(i));
        }
        for (int i = 0; i < result.length - 1; i++) {
            int currentMin = result[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < result.length; j++) {
                if (currentMin > result[j]) {
                    currentMin = result[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                result[currentMinIndex] = result[i];
                result[i] = currentMin;
            }
        }

        String resultString = "";
        for (int i = 0; i < result.length; i++) {
            resultString += (char) (result[i]);
        }

        return resultString;

    }
}
