package week_05.live_class;

public class ComputeFutureTuition {
    public static void main(String[] args) {

        double tuition = 10000;
        double tuition10 = 0;
        double tuition11 = 0;
        double tuition12 = 0;
        double tuition13 = 0;
        double tuition14 = 0;

        for (int i = 1; i <= 14; i++) {
            tuition += (int) (tuition * 0.05);
            if (i == 10) {
                tuition10 = tuition;
            } else if (i == 11) {
                tuition11 = tuition;
            } else if (i == 12) {
                tuition12 = tuition;
            } else if (i == 13) {
                tuition13 = tuition;
            } else if (i == 14) {
                tuition14 = tuition;
            }
        }
        System.out.printf("Tuition in ten years $%.0f\n", tuition10);
        System.out.printf("Total cost of four years is $%.0f", (tuition11 + tuition12 + tuition13 + tuition14));

    }
}
