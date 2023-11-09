package week_10.assignments.Question_10_22;

public class Question_10_22 {
    public static void main(String[] args) {
        char[] ch = {'I', 'N', 'A', 'R'};
        MyString1 myString = new MyString1(ch);
        char[] ch1 = {'I', 'N', 'A', 'T'};
        MyString1 myString1 = new MyString1(ch1);
        char[] ch2 = {'i', 'n', 'a'};
        MyString1 myString2 = new MyString1(ch2);
        System.out.println(myString);
        System.out.println(myString.toLowerCase());
        System.out.println(myString.substring(0, 3));
        System.out.println(myString.length());
        System.out.println(myString.equals(myString1)); //false
        System.out.println(myString.equals(myString2)); //true
        System.out.println(MyString1.valueOf(65913));
    }
}
