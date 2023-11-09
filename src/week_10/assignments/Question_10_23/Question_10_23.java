package week_10.assignments.Question_10_23;

public class Question_10_23 {
    public static void main(String[] args) {

        MyString2 word = new MyString2("Hello World");
        MyString2 word1 = new MyString2("inar academy-03/2024");
        MyString2 word2 = new MyString2("Hello World");


        System.out.println(word);
        System.out.println(word.toUpperCase());
        System.out.println(word1.toUpperCase());
        System.out.println(word.substring(6));

        System.out.println(word.compare(word1.toString()));

        char[] newWord = word.toChars();
        System.out.println(newWord[4]);


        System.out.println(MyString2.valueOf(word.toString().equals(word1.toString())));

        System.out.println(MyString2.valueOf(word.toString().equals(word2.toString())));


    }
}
