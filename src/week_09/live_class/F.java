package week_09.live_class;

public class F {
    private int i = 5;
    private static double k = 0;
    public F(){

    }

    public void setI(int i) {
        this.i = i;
    }

    public static void setK(double k) {
        F.k = k;
    }
    public int getI(){
        return i;
    }
}
