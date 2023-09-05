package week_05.live_class;
import java.util.Scanner;
public class WhileGuessingNumbers {
    public static void main(String[] args) {
        int createdNumber =  (int) (Math.random()*101);
        System.out.println(createdNumber);
        Scanner input = new Scanner (System.in);
        System.out.println("Please guess the created number: ");
        int guessNumber = input.nextInt();

        if (guessNumber==createdNumber){
            System.out.println("Congratulations, you got it at the first try.");
        }else{
            while(guessNumber!=createdNumber){
                System.out.println("Please try again.");
                guessNumber = input.nextInt();
                if(guessNumber>(25+createdNumber)){
                    System.out.println("your guess is \"too\" high.  ");
                }else if (guessNumber>createdNumber){
                    System.out.println("your guess is much closer, but still high. ");
                }else if((guessNumber+25)<createdNumber){
                    System.out.println("your guess is \"too\" low. ");
                }else if (guessNumber<createdNumber){
                    System.out.println("your guess is much closer, but still low. ");
                }
            }System.out.println("You found it at the end bro.");

        }

    }
}
