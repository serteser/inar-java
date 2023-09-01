package week_04.assignments;
import java.util.Scanner;
public class Question_04_19 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbnNumber = input.nextInt();
        int d1 = isbnNumber%10;
        int d2 = isbnNumber/10%10;
        int d3 = isbnNumber/100%10;
        int d4 = isbnNumber/1000%10;
        int d5 = isbnNumber/10000%10;
        int d6 = isbnNumber/100000%10;
        int d7 = isbnNumber/1000000%10;
        int d8 = isbnNumber/10000000%10;
        int d9 = isbnNumber/100000000%10;
        int d10 = ((d9*1)+(d8*2)+(d7*3)+(d6*4)+(d5*5)+(d4*6)+(d3*7)+(d2*8)+(d1*9))%11;

        if(d10==10){
            System.out.print("The ISBN-10 number is " + d9+""+d8+""+d7+""+d6+""+d5+""+d4+""+d3+""+d2+""+d1+"X");
        }
        else{
            System.out.print("The ISBN-10 number is " + d9+""+d8+""+d7+""+d6+""+d5+""+d4+""+d3+""+d2+""+d1+""+d10);
        }

    }
}
