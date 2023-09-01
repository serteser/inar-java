package week_03.live_class;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        int number1 = (int) (System.currentTimeMillis()%10);
        int number2 = (int) (System.currentTimeMillis()/5%10);
        Scanner input = new Scanner(System.in);
        System.out.println( "What is " + number1 + " + " + number2 + " = ? ");
        int answer = input.nextInt();
        if ( answer == number1 + number2) {
            System.out.println("correct !! ");
        } else{
            System.out.println(" \"incorrect\" ");
        }

    }
}
