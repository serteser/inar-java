package week_05.live_class;

public class Pyramid {
    public static void main(String[] args) {
        int height = 5; // Change the height of the pyramid as needed

        // Print the pyramid with increasing numbers
        System.out.println("Pyramid with Increasing Numbers:");
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to the next line
        }

        // Print a separator between the two pyramids
        System.out.println("\n-----------------------------\n");

        // Print the pyramid with decreasing numbers
        System.out.println("Pyramid with Decreasing Numbers:");
        for (int i = height; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
