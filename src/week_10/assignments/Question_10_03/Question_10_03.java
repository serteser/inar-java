package week_10.assignments.Question_10_03;

public class Question_10_03 {
    public static void main(String[] args) {

        MyInteger number = new MyInteger(41614161);
        char[] ch = {'1', '2', '3'};
        String str = "123";
        System.out.println("getValue(): " + number.getValue());
        System.out.println("isEven(): " + number.isEven());
        System.out.println("isOdd(): " + number.isOdd());
        System.out.println("isPrime(): " + number.isPrime());
        System.out.println("equals(10): " + number.equals(10));
        System.out.println("equals(MyInteger(41614161): " + number.equals(number));
        System.out.println("isEven(41614161) static: " + MyInteger.isEven(41614161));
        System.out.println("isOdd(41614161) static: " + MyInteger.isOdd(41614161));
        System.out.println("isPrime(41614161) static: " + MyInteger.isPrime(41614161));
        System.out.println("parseInt(char[]{1, 2, 3}) static: " + MyInteger.parseInt(ch));
        System.out.println("parseInt(String 123) static: " + MyInteger.parseInt(str));


    }


}
