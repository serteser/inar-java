package week_04.assignments;

public class Question_04_16 {
    public static void main(String[] args) {
        int randomNumber = 65 + (int) (Math.random() * (91 - 65));
        char upperCaseLetter = (char) randomNumber;
        System.out.println(upperCaseLetter);
    }
}
