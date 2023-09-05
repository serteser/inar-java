package week_05.live_class;

public class NestedLoopsMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\n                Multiplication Table");
        System.out.print("       ");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < 45; i++) {
            System.out.print("-");
        } // Display table body
        for (int i = 1; i < 10; i++) {
            System.out.printf("\n%5d |", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);

            }
        }


    }
}
