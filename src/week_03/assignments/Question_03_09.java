package week_03.assignments;
import java.util.Scanner;
public class Question_03_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int d1 = isbn%10;
        int d2 = isbn/10%10;
        int d3 = isbn/100%10;
        int d4 = isbn/1000%10;
        int d5 = isbn/10000%10;
        int d6 = isbn/100000%10;
        int d7 = isbn/1000000%10;
        int d8 = isbn/10000000%10;
        int d9 = isbn/100000000%10;
        int d10 = ((d9*1)+(d8*2)+(d7*3)+(d6*4)+(d5*5)+(d4*6)+(d3*7)+(d2*8)+(d1*9))%11;

        if(d10==10){
            System.out.print("The ISBN-10 number is " + d9+""+d8+""+d7+""+d6+""+d5+""+d4+""+d3+""+d2+""+d1+"X");
        }
        else{
            System.out.print("The ISBN-10 number is " + d9+""+d8+""+d7+""+d6+""+d5+""+d4+""+d3+""+d2+""+d1+""+d10);
        }




    }
}
