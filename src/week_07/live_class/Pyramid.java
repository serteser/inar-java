package week_07.live_class;

public class Pyramid {
    public static void main(String[] args) {
        final int STAIR = 10;
        for (int i = 1; i <= STAIR; i++) {
            for (int j = 0; j < STAIR-i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; i > k; k++) {
                System.out.printf("%3d", (i-k) );
            }
            for (int m = 2; m <= i; m++) {
                System.out.printf("%3d", m);
            }
            for (int j = 0; j < 2*(STAIR-i); j++) {
                System.out.print("   ");
            }
            for (int k = 0; i > k; k++) {
                System.out.printf("%3d", (i-k) );
            }
            for (int m = 2; m <= i; m++) {
                System.out.printf("%3d", m);
            }

            System.out.println();
        }
    }
}
