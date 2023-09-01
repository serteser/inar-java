package week_03.live_class;
import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[] args){

        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);

        if(number2>number1){
            int numberVice = number2;
            number2=number1;
            number1= numberVice;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("What is " +number1 + " - " + number2 + " =? ");
        int answer = input.nextInt();

        boolean correct = number1-number2==answer;
        if(correct){
            System.out.println("Your answer is correct, \"congratulations !\" ");
        } else{
            System.out.println("The answer of " + number1 + " - " + number2 + " = " + answer + " is incorrect ! " +
                    "\n The right answer should be " + (number1 - number2) );
        }


    }
}
