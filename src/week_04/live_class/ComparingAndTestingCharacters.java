package week_04.live_class;

public class ComparingAndTestingCharacters {
    public static void main(String[] args){
        char chickenPeas = '-';
        System.out.println("Is chickenPeas digit ?  " + Character.isDigit(chickenPeas));
        System.out.println("Is chickenPeas letter ?  " + Character.isLetter(chickenPeas));
        System.out.println("Is chickenPeas uppercase ?  " + Character.isUpperCase(chickenPeas));
        System.out.println("Is chickenPeas lowercase ?  " + Character.isLowerCase(chickenPeas));
        System.out.println("Is chickenPeas letter or digit ?  " +Character.isLetterOrDigit(chickenPeas));
        System.out.println("Is chickenPeas to uppercase ?  " + Character.toUpperCase(chickenPeas));
        System.out.println("Is chickenPeas to lowercase ?  " + Character.toLowerCase(chickenPeas));
        char letter1 = 'B';
        int number = (int) 'B';
        number +=7;
        char letter2 = (char) number;
        char ch1 = 'E';
        char ch2 = 'r';
        String word1 = ch1 + "";
        String word2 = ch2 + "";
        String word = word1.concat(word2);
        System.out.println((3 + ch1 )+ " " + (5 + ch2) + " were running.");
         char i = '1';
         char j = '2';
        System.out.println(" " + i+j);

    }
}
