package week_04.assignments;
import java.util.Scanner;
public class Question_04_14 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a letter grade: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        int grade = ch;
        if(grade == 70){
            System.out.println("The numeric value for grade " + ch + " is " + 0 );
        }else if (65<=grade&&grade<=68){
            grade = Math.abs(grade - 69);
            System.out.println("The numeric value for grade " + ch + " is " + grade );
        }else{
            System.out.println(ch + " is an invalid grade" );
        }






    }

}
