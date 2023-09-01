package week_04.assignments;

public class Question_04_08 {
    public static void main(String[] args) {

        // Write a statement that generates a number between 0-127 (inclusive 127).
        int ascııCode = (int) (Math.random() * 128);
        System.out.println("\nEnter an ASCII code: " + ascııCode);

        // A char can be casted into any numeric type, and vice versa...
        char ascıı = (char) ascııCode;

        // Display it as a character.
        System.out.println("\nThe character for ASCII code " + ascııCode + " is " + ascıı);


    }
}
