package week_10.assignments.Question_10_22;

 class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        char ch;
        ch = chars[index];
        return ch;
    }

    public MyString1 substring(int begin, int end) {
        char[] ch = new char[(end - begin)];
        MyString1 myStr = new MyString1(ch);
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i >= begin && i < end) {
                ch[index] = chars[i];
                index++;
            }
        }
        chars = ch;
        return myStr;
    }

    public MyString1 toLowerCase() {
        MyString1 myStr = new MyString1(chars);
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return myStr;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += "" + this.chars[i];
        }
        return s;
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        String s = i + " ";
        char[] ch = new char[s.length()];
        for (int j = 0; j < s.length(); j++) {
            ch[j] = s.charAt(j);
        }
        return new MyString1(ch);
    }
}
