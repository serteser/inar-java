package week_04.live_class;

public class ConversionBetweenStringsAndNumbers {
    public static void main(String[] args){
        String intString = "1234";
        System.out.println(intString+5);
        int intValue = Integer.parseInt(intString);
        System.out.println(intValue+5);
        String doubleString = "123.456";
        double a = Double.parseDouble(doubleString);
        System.out.println("******************");
        System.out.println(doubleString+3);
        System.out.println(a+3);
        intString +=8;
        intString = intString.concat("8");
        System.out.println(intString);
    }
}
