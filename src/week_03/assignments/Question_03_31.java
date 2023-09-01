package week_03.assignments;
import java.util.Scanner;
public class Question_03_31 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int valueForConvert = input.nextInt();
        double rmb = 0;
        double dollars = 0;
        switch(valueForConvert){
            case 0 :
                System.out.print("Enter the dollar amount: ");
                dollars = input.nextDouble();
                rmb= exchangeRate * dollars;
                System.out.println("$" + dollars + " is " + rmb + " yuan");break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                rmb = input.nextDouble();
                dollars = rmb/exchangeRate;
                System.out.println( rmb + " yuan is $" + (int) (dollars*100)/100.0);break;
            default:
                System.out.println("Incorrect input");

        }


    }
}
