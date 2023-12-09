package week_12.live_class;

public class StringBuilderTest {
    public static void main(String[] args) {

        char[] ch = {'p', 'a', 'p', 'a'};

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder(0);
        StringBuilder str3 = new StringBuilder("todoT");
        System.out.println(str1.append(ch));
        System.out.println(str1.append(45));
        System.out.println(str1.append(" take me as a sacrifice..."));
        System.out.println(str1.delete(4, 6));
        System.out.println(str1.deleteCharAt(0));
        System.out.println(str2.append("take me as a sacrifice "));
        //System.out.println(str2.insert(8, ch, 0, 4));
        System.out.println(str2.insert(str2.length(), ch));
        String s = " 56";
        System.out.println(str2.insert(22, s));
        System.out.println(str3.reverse());
        str3.setCharAt(2,'o');
        System.out.println(str3);
        String s1 = "Question3_6";

        if(s1.matches("Question\\d_\\d")){
            System.out.println(s1);
        }


    }
}
