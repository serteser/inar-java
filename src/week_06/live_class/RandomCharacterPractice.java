package week_06.live_class;

import static week_06.live_class.GetRandomCharacter.*;

public class RandomCharacterPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(getRandomUpperCaseLetterCharacter() + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print(getRandomLowerCaseLetterCharacter() + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print(getRandomNumberCharacter() + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print(getRandomCharacterFromAsciiTable() + " ");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print(getRandomCharacter('!', '/') + " ");
        }
        System.out.println();

        for (int i = 1; i <= 175; i++) {
            System.out.print(getRandomCharacter('!', '}') + " ");
            if(i%25==0){
                System.out.println();
            }
        }
    }
}
