package week_05.live_class;

import java.util.Scanner;

public class WhileRepeatAdditionQuiz {
    public static void main(String[] args){
        int number1 =  (int) (Math.random()*10);
        int number2 =  (int) (Math.random()*10);

        Scanner input = new Scanner (System.in);
        System.out.printf("Please enter the answer of this addition question:\n%d + %d = ?  ",number1,number2);
        int answer = input.nextInt();

        while(number1+number2!=answer){
            System.out.printf("Wrong answer, try again.\nWhat is %d + %d = ?  ",number1,number2);
            answer = input.nextInt();
        }
        System.out.println("Right answer, good job.");

    }
}
