package week_05.live_class;

import java.util.Scanner;

public class WhileSubtractionLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);
        if (number2>number1){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        int rightAnswer = number1 - number2;
        System.out.printf("\nPlease enter the answer of this algebraic operation;\n%d - %d = ?\n", number1,number2 );
        int answer = input.nextInt();

        if( answer==rightAnswer){
            System.out.println("Yes you got it at the first try. \"Congratulations!\"");
        }else{
            while(answer != rightAnswer){
                System.out.printf("Your answer is \"INCORRECT\" !!!\nThe right answer of %d - %d =  should be \"%d\".",number1, number2, rightAnswer );
                number1 = (int) (Math.random()*10);
                number2 = (int) (Math.random()*10);
                if (number2>number1){
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }
                    System.out.printf("\nLet's try again. Please enter the answer of that algebraic operation;\n%d - %d = ?\n", number1,number2 );
                    answer = input.nextInt();
                    rightAnswer = number1-number2;

            }System.out.println("Now you did it! Good job.");
        }


                

    }
}
