package week_09.live_class;

public class TestF {
    public static void main(String[] args) {
        F f1 = new F();
        F f2 = new F();
        f1.setI(10);
        f2.setI(45);
        System.out.println(f1.getI());
        System.out.println(f2.getI());
        f1.setK(12.5);
        F.setK(3.9);

    }
}
