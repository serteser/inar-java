package week_10.assignments.Question_10_23;

public class MyString2 {
    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public int compare(String s) {
        int length = Math.max(this.s.length(), s.length());
        for (int i = 0; i < length; i++) {
            char sOld = this.s.charAt(i);
            char sNew = s.charAt(i);
            if (sOld != sNew) {
                return sOld - sNew;
            }
        }
        return 0;
    }

    public String toString() {
        return s;
    }

    public MyString2 substring(int begin) {
        String n = "";
        for (int i = begin; i < s.length(); i++) {
            n += s.charAt(i);
        }
        return new MyString2(n);
    }

    public MyString2 toUpperCase() {
        String n = "";
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                n += (char) (ch - 32);
            } else {
                n += ch;
            }

        }
        return new MyString2(n);
    }

    public char[] toChars() {
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }

    }
}
