package week_01.assignments;

public class Question_01_11 {
    public static void main(String[] args) {
        System.out.println("Year 1 projection:");
        System.out.println(312032486 + (365 * 24 * 60 * 60 / 7.0F) - (365 * 24 * 60 * 60 / 13.0F) + (365 * 24 * 60 * 60 / 45.0F));
        System.out.println("Year 2 projection:");
        System.out.println(312032486 + (2 * 365 * 24 * 60 * 60 * (1 / 7.0F - 1 / 13.0F + 1 / 45.0F)));
        System.out.println("Year 3 projection:");
        System.out.println(312032486 + (3 * 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45)));
        System.out.println("Year 4 projection:");
        System.out.println(312032486 + (4 * 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45)));
        System.out.println("Year 5 projection:");
        System.out.println(312032486 + (5 * 365 * 24 * 60 * 60 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45)));
    }
}
