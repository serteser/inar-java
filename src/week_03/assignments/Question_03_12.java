package week_03.assignments;
import java.util.Scanner;
public class Question_03_12 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a three-digit integer : ");
        int number = input.nextInt();

        int firstDigit = number%10;
        int thirdDigit = number/100;

        if (firstDigit==thirdDigit){
            System.out.println(number+ " is a palindrome");
        }else{
            System.out.println(number+ " is not a palindrome");
        }

    }
}
