package week_03.live_class;

public class ConditionalExpressions {
    public static void main(String[] args){
        int number1 = 42 + ((int) (Math.random()*(132-42)));
        int number2 = (int) (Math.random()*101);
        System.out.println(number1 + " / " + number2);
        System.out.println(number1%2==0 ? "number1 is even" : "number1 is odd" );
        System.out.println(number2%2==0 ? "number2 is even" : "number2 is odd" );








    }
}
