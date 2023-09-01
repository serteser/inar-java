package week_03.live_class;
import java.util.Scanner;
public class FederalPersonalTaxRates {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household)" +
                "\nEnter the filing status: ");
        int filingStatus = input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax = 0;
        if(filingStatus==0){
            if(income<=8350){
                 tax = income * 0.1;
            }else if ( income<=33950){
                tax = ((income-8350)*(15/100)) + (8350 * 0.1);
            }else if(income<=8250){
                tax = ((income-33950)*(25.0/100)) + ((33950-8350)*(15.0/100)) + (8350 * 0.1);
            }else if(income<=171550){
                tax = ((income-82250)*(28.0/100)) + ((82250-33950)*(25.0/100)) + ((33950-8350)*(15.0/100)) + (8350 * 0.1);
            }else if (income<=372950){
                tax = ((income-171550)*(33.0/100) + ((171550-82250)*(28.0/100)) + ((82250-33950)*(25.0/100)) + ((33950-8350)*(15.0/100)) + (8350 * 0.1));
            }else{
                tax = ((income-372950)*(35/100.0))+((372950-171550)*(33/100.0))+((171550-82250)*28/100.0)+((82250-33950)*25/100.0)+((33950-8350)*15/100.0)+(8350*10/100.0);
            }
        }
        else if (filingStatus==1){

        }
        else if (filingStatus==2){

        }
        else if (filingStatus==3){

        }else{

        }
        System.out.println("Tax is " + tax );



    }
}
