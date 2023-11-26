package week_12.live_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientWithException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");

        int number1 = input.nextInt();
        System.out.println("1");
        try {

            int number2 = input.nextInt();
            System.out.println("2");
            int i = quotient(number1, number2);
            System.out.println("3");
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
            System.out.println("4");
        } catch (IllegalArgumentException ex) {

            System.out.println("Divisor cannot be three");
        } catch (ArithmeticException ex) {

            System.out.println("cannot be divided by zero");
        }catch (InputMismatchException ex) {

            System.out.println("cannot be divided by string");
        }finally{
            System.out.println("This runs always . .");
        }

        System.out.println("Execution continues ...");


    }

    public static int quotient(int number1, int number2) throws IllegalArgumentException {
        if (number2 == 3) {
            throw new IllegalArgumentException("Divisor cannot be three");
        }
        return number1 / number2;
    }


}

