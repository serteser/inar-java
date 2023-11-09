package week_10.assignments.Question_10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return Math.abs(value) % 2 == 0;
    }

    public boolean isOdd() {
        return Math.abs(value) % 2 == 1;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        } else {
            for (int i = 2; i <= value / 2; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return Math.abs(value) % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return Math.abs(value) % 2 == 1;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        } else {
            for (int i = 2; i <= value / 2; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger value) {
        return Math.abs(value.getValue()) % 2 == 0;
    }

    public static boolean isOdd(MyInteger value) {
        return Math.abs(value.getValue()) % 2 == 1;
    }

    public static boolean isPrime(MyInteger value) {
        if (value.getValue() <= 1) {
            return false;
        } else {
            for (int i = 2; i <= value.getValue() / 2; i++) {
                if (value.getValue() % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger value) {
        return this.value == value.getValue();
    }

    public static int parseInt(char[] ch) {
        String s = "";
        for (int i = 0; i < ch.length; i++) {
            s += ch[i];
        }
        return Integer.parseInt(s);

    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
