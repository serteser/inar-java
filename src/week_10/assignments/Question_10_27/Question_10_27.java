package week_10.assignments.Question_10_27;

public class Question_10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 cat = new MyStringBuilder1("THE CAT HAS MAKE A SOUND, ");
        System.out.println(cat);
        MyStringBuilder1 said = new MyStringBuilder1("MEOW! NEXT-DOOR AT ");
        System.out.println(cat.append(said));
        System.out.println(cat.append(17));
        System.out.println(cat.length());
        System.out.println(cat.charAt(17));
        System.out.println(cat.toLowerCase());
        System.out.println(cat.substring(12, 24));
        System.out.println(cat);

    }
}
