package week_06.live_class;

public class PassingArgumentsByValues {
    public static void main(String[] args) {
        nPrintln("What winds blow you here bro?", 10);
    }
    public static void nPrintln(String message, int n){
        for (int i = 1 ; i<=n ; i++){
            System.out.println(message);
        }
    }
}
