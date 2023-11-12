package week_10.live_class;

public class MatchingReplacingAndSplittingByPatterns {
    public static void main(String[] args) {
        String s = "java is cool";
        String d = "a+b$#c";
        String f = "123-000-1-23";
        String k = "\"Java,C?C#,C++";

        System.out.println(d.replaceAll("[$+#]","?"));
        System.out.println(f.matches("\\d{3}-\\d{3}-\\d-\\d{2}"));
        String[] l = k.split("[,]");
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }


    }
}
