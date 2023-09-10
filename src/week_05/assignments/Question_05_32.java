package week_05.assignments;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        String pick = input.nextLine();
        int first= 1+(int) (Math.random()*9);
        int second= first;
        String lottery="";
        for(int i=0; second==first; i++ ){
            second= 1+(int) (Math.random()*9);
        }

        lottery += first;
        lottery += second ;
        System.out.print("The lottery number is " + lottery);

        char lotteryFirst = lottery.charAt(0);
        char lotterySecond = lottery.charAt(1);
        char pickFirst= pick.charAt(0);


        if (pick.length()!=2){
            pick.trim();
            char digit= pick.charAt(0);
            if ((digit==lotteryFirst||digit==lotterySecond)){
                System.out.println("\nMatch just one digit, the award is $1000");
            }else{
                System.out.println("\nSorry, no match");
            }
        }


        if (pick.length()==2){
            char pickSecond = pick.charAt(1);
            if(pick.equals(lottery)){
                System.out.println("\nMatch in the exact order, the award is $10000");
            }else if ((pickFirst==lotterySecond)&&(pickSecond==lotteryFirst)){
                System.out.println("\nMatch all digits, the award is $3000");
            }else if ((pickFirst==lotteryFirst||pickFirst==lotterySecond)||(pickSecond==lotteryFirst||pickSecond==lotterySecond)){
                System.out.println("\nMatch just one digit, the award is $1000");
            }else{
                System.out.println("\nSorry, no match");
            }
        }



    }
}
