package week_06.live_class;

public class StackOverFlowExample {
    public static void main(String[] args) {
        String message = "Inar Academy";
        print (message);
    }
    public static void print (String n){

            System.out.printf("%s\n", n);

        print(n);

    }
}

