package week_10.assignments.Question_10_24;

public class Question_10_24 {
    public static void main(String[] args) {
        MyCharacter character = new MyCharacter();
        MyCharacter character1 = new MyCharacter('R');
        System.out.println(character1.getCharacter());
        System.out.println(character.getCharacter());
        System.out.println(character1.isUpperCase());
        System.out.println(character.toChar());
        character.setCharacter('J');
        System.out.println(character.isLetter());
        System.out.println(character1.toUpperCase());
        System.out.println(character.isDigit());
        System.out.println(character1.isLetterOrDigit());
        System.out.println(character.toLowerCase());
        System.out.println(character1.compareObjectAndChar('t'));
        System.out.println(MyCharacter.compare('a', '5'));
    }
}
