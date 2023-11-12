package week_10.assignments.Question_10_28;

public class MyStringBuilder2 {
    private String s;

    public MyStringBuilder2() {
        s = "";
    }

    public MyStringBuilder2(char[] chars) {
        this.s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String firstPart = this.s.substring(0, offset);
        String additionalPart = "" + s;
        String lastPart = this.s.substring(offset);
        return new MyStringBuilder2(firstPart + additionalPart + lastPart);
    }

    public MyStringBuilder2 reverse() {
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n += s.charAt(i);
        }
        return new MyStringBuilder2(n);
    }

    public MyStringBuilder2 substring(int begin) {
        s = this.s.substring(begin);
        return new MyStringBuilder2(s);
    }

    public MyStringBuilder2 toUpperCase() {
        String n = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                n += (char) (ch - 32);
            } else {
                n += ch;
            }
        }
        s = n;
        return this;
    }

}
