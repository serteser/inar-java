package week_06.assignments;

import java.util.Scanner;

public class Question_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter milliseconds: ");
        Long millis = input.nextLong();
        System.out.println("hours : minutes : seconds  " + convertMillis(millis));
    }
    public static String convertMillis(long millis){
        String s = "";
        int seconds = (int) ((millis/1000)%60);
        int minutes = (int) ((millis/1000)/60%60);
        int hours = (int) ((millis/1000)/60/60);
        s+= hours+":"+minutes+":"+seconds;
        return s;
    }
}
