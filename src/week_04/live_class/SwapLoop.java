package week_04.live_class;

public class SwapLoop {
    public static void main(String[] args) {
        int number1 =  (int) ((Math.random()/3)*100);
        int number2 =  (int) (Math.random()*100);
        System.out.println("before execution, number1 =>" + number1 + " and number2 =>" +number2 );
        number1 = Math.max(number1,number2)-Math.abs(number1-number2);
        number2 = number1 + Math.abs(number1-number2);
        System.out.println("after execution, number1 =>" + number1 + " and number2 =>" +number2);
    }
}
