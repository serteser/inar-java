package week_05.assignments;

import java.util.Scanner;

public class Question_05_37 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter a decimal integer: ");
        int numberInitial = input.nextInt();
        int number= numberInitial;
        int binaryPow;
        int binaryPlaces =0;
        int i ;
        String binary = "";

                // Finding the number of binary places;

            for (i = 1; i<number ; i++){

                binaryPow = (int) Math.pow(2,i);

                binaryPlaces++;

                if(binaryPow>=number){
                    break;
                }
            }
        binaryPlaces=i;

                // Displaying the binary;

        for(int j =1; j<=binaryPlaces; j++){
            if(number >= (int) Math.pow(2,(binaryPlaces-j))){
                binary+= 1 + "";
                number-=(int) Math.pow(2,(binaryPlaces-j));
            }else{
                binary+= 0 + "";
            }

        }
        number=numberInitial;

        System.out.printf("The binary value of the decimal \"%d\" is %s", number, binary);



    }


}
