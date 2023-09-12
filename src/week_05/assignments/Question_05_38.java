package week_05.assignments;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter a decimal integer: ");
        int numberInitial = input.nextInt();
        int number = numberInitial;
        String octal = "";
        int octalPow= 0;
        int numberOfPlaces=0;

        // Finding number places of the octal;
        for (int i =0; i<=number; i++){
            octalPow+=7* (int) Math.pow(8,(i));
            numberOfPlaces++;
           if(number<=octalPow){
               break;
           }
        }
        System.out.println(number);
        for(int j =7, k=1 ;j>=0 ; j-- ){


            if (number>= ((j)* (int) (Math.pow(8,numberOfPlaces-k)))){
                octal+=j+"";
                number-=((j)* (int) (Math.pow(8,numberOfPlaces-k)));
                k++;
                j=8;
                if(k>numberOfPlaces){
                    break;
                }

            }

        }
        number=numberInitial;
        System.out.printf("The octal of %d is %s", number, octal);
    }
}
