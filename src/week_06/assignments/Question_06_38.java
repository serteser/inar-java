package week_06.assignments;

public class Question_06_38 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        count = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(getRandomDigitCharacter() + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }

    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + (Math.random() * (ch2 - ch1)));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

}
