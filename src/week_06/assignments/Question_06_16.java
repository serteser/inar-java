package week_06.assignments;

public class Question_06_16 {
    public static void main(String[] args) {
        System.out.println("Year       Days in year");
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%d %13d", i, numberOfDaysInAYear(i));
            System.out.println();
        }

    }

    public static int numberOfDaysInAYear(int year) {
        int result = 0;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            result = 366;
        } else {
            result = 365;
        }
        return result;
    }
}
