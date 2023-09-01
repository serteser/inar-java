package week_03.assignments;
import java.util.Scanner;
public class Question_03_14 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int headOrTail = ((int) (Math.random()*1000))%2;

        System.out.println("Guess the flip of coin (0 represents head and 1 represents tail) : ");
        int guess = input.nextInt();


        if(guess==headOrTail){
            System.out.println(headOrTail + "\nYour guess is correct");
        }else{
            System.out.println(headOrTail + "\nYour guess is incorrect");
        }


    }
}
