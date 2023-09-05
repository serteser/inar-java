package week_04.assignments;

public class Question_04_25 {
    public static void main(String[] args) {
        int plateLetter1 = 65 + (int) (Math.random() * (91 - 65));
        int plateLetter2 = 65 + (int) (Math.random() * (91 - 65));
        int plateLetter3 = 65 + (int) (Math.random() * (91 - 65));
        int number = 1000 + (int) (Math.random() * (10000 - 1000));
        char plateChar1 = (char) (plateLetter1);
        char plateChar2 = (char) (plateLetter2);
        char plateChar3 = (char) (plateLetter3);
        String plateNumber = "";
        plateNumber = plateNumber + plateChar1 + plateChar2 + plateChar3 + number;
        System.out.println(plateNumber);


    }
}
