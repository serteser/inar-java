package week_03.live_class;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean leap = (year%4==0 && year%100!=0)|| year%400==0;
        if((year%4==0 && year%100!=0)|| year%400==0){

        }
        System.out.println(year + " is leap year ? " + leap);

    }
}
