package week_03.live_class;

//import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int number = (int) (System.currentTimeMillis() % 10000);
        //System.out.println("Please enter your number: ");
        // int number = input.nextInt();
        System.out.println("The number " + number + " is; ");
        if (number % 10 == 0) {
            System.out.println("Divides by ten without remainder...");
        } else {
            System.out.println("NOT divides by ten without remainder...");
        }

        if (number % 5 == 0) {
            System.out.println("Divides by five without remainder...");
        } else {
            System.out.println("NOT divides by five without remainder...");
        }

        if (number % 6 == 0) {
            System.out.println("Divides by six without remainder...");
        } else {
            System.out.println("NOT divides by six without remainder...");
        }

        number = (number % 10) + (number % 5) + (number % 6);
        if (number == 0) {
            System.out.println("So we have a magic \"number.\" ");
        } else {
            System.out.println("We have not a magic number yet! Try again!");
        }


    }
}
