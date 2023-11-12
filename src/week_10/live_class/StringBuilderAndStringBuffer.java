package week_10.live_class;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder fog = new StringBuilder("watch out...");
        StringBuilder fogy = new StringBuilder("welcome to java");
        StringBuilder fogs = new StringBuilder("şşşşşt!");
        char[] ch = {'y','o','u','?'};
        System.out.println(fogy.append(ch));
        System.out.println(fogy.insert(11, "HTML and "));
    }
}
