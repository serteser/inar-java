package week_10.assignments.Question_10_27;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.s += s;
        return this;
    }

    @Override
    public String toString() {
        return s;
    }

    public MyStringBuilder1 append(int i) {
        this.s += i;
        return this;
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                n += (char) (ch + 32);
            } else {
                n += ch;
            }
        }
        s = n;
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        this.s = s.substring(begin, end);
        return this;
    }
}
