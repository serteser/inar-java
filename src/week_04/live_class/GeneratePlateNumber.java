package week_04.live_class;

public class GeneratePlateNumber {
    public static void main(String[] args) {
        int plateLetter1 = 65 + (int) (Math.random() * (91 - 65));
        int plateLetter2 = 65 + (int) (Math.random() * (91 - 65));
        int plateLetter3 = 65 + (int) (Math.random() * (91 - 65));
        int plateNumber1 = (int) (Math.random() * 10);
        int plateNumber2 = (int) (Math.random() * 10);
        int plateNumber3 = (int) (Math.random() * 10);
        int plateNumber4 = (int) (Math.random() * 10);
        char plateChar1 = (char) (plateLetter1);
        char plateChar2 = (char) (plateLetter2);
        char plateChar3 = (char) (plateLetter3);


        System.out.println("Generated plate number: " + plateChar1 + plateChar2 + plateChar3 + plateNumber1 + plateNumber2 + plateNumber3 + plateNumber4);


    }
}
