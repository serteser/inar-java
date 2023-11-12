package week_10.assignments.Question_10_24;

public class MyCharacter {

    private char character;

    public MyCharacter() {
        this('a');
    }

    public MyCharacter(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public boolean isUpperCase() {
        return (character >= 65 && character <= 90);
    }

    public boolean isLetter() {
        if (character >= 'A' && character <= 'z') {
            if (character < 91 ^ character > 96) {
                return true;
            }
        }
        return false;
    }

    public boolean isDigit() {
        return (character >= '0' && character <= '9');
    }

    public boolean isLetterOrDigit() {
        return (isLetter() || isDigit());
    }

    public char toUpperCase() {
        if (isLetter() && !isUpperCase()) {
            character -= ' ';
        }
        return character;
    }

    public char toLowerCase() {
        if (isLetter() && isUpperCase()) {
            character += ' ';
        }
        return character;
    }

    public char toChar() {
        return character;
    }

    public static int compare(char ch1, char ch2) {
        return ch1 - ch2;
    }
    public int compareObjectAndChar(char ch) {
        return character - ch;
    }

}
