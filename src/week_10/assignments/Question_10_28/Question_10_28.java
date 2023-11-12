package week_10.assignments.Question_10_28;

public class Question_10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 s1 = new MyStringBuilder2("1907");
        MyStringBuilder2 s2 = new MyStringBuilder2("Fenerbahce");
        MyStringBuilder2 s3 = new MyStringBuilder2("190Fener07bahce07");
        System.out.print("Insert s2 into s1 at index 2 --------> ");
        System.out.println(s1.insert(2, s2));
        System.out.print("Reverse s2 --------------------------> ");
        System.out.println(s2.reverse());
        System.out.print("Substring of s3 beginning index 10 --> ");
        System.out.println(s3.substring(10));
        System.out.print("S2 to upper case --------------------> ");
        System.out.println(s2.toUpperCase());


    }
}
