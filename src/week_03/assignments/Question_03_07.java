package week_03.assignments;
import java.util.Scanner;
public class Question_03_07 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the amount (e.g 11,56): ");
        double amount1 = input.nextDouble();

        int amount = (int) (amount1 * 100);
        int dollars = amount/100;
        int quarters = amount%100/25;
        int dimes = amount%100%25/10;
        int nickels = amount%100%25%10/5;
        int pennies = amount%100%25%10%5/1;
        System.out.println("Your amount " + amount1 + " consist of ");

        if(dollars>1){
            System.out.println(dollars + " dollars");
        }else{
            System.out.println(dollars + " dollar");
        }
        if(quarters>1){
            System.out.println(quarters + " quarters");
        }else{
            System.out.println(quarters + " quarter");
        }
        if(dimes>1){
            System.out.println(dimes + " dimes");
        }else{
            System.out.println(dimes + " dime");
        }
        if(nickels>1){
            System.out.println(nickels + " nickels");
        }else{
            System.out.println(nickels + " nickel");
        }
        if(pennies>1){
            System.out.println(pennies + " pennies");
        }else {
            System.out.println(pennies + " pennie");
        }

    }
}
