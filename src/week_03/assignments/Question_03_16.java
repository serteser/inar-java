package week_03.assignments;

public class Question_03_16 {
    public static void main(String[] args) {
        int number1 = -50 + ((int) (Math.random() * (50 - (-50)))); // for width
        int number2 = -100 + ((int) (Math.random() * (100 - (-100)))); // for height
        System.out.println("Random coordinate in rectangle centered at (0,0) with width 100 and height 200: " +
                "(" + number1 + ", " + number2 + ")");

    }
}
