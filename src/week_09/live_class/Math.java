package week_09.live_class;

public class Math {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int x1 = 3;
        int y1 = 4;
        int x2 = 5;
        int y2 = 6;
        int result = ((y1 - y2) * x) - ((x1 - x2) * y);
        int result1 = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        System.out.println("result =>" + result);
        System.out.println("result1 =>" + result1);
        System.out.println("***********************************");
        result = ((y2-y1) * x) + ((x1 - x2) * y);
        result1 = ((y2-y1) * x1) + ((x1 - x2) * y1);
        System.out.println("result =>" + result);
        System.out.println("result1 =>" + result1);
    }

}
