package week_07.live_class;

public class ShiftingElementsToRight {
    public static void main(String[] args) {
        int[] ant = {12, 45, 789, 3, 4, 8, 17};
        for (int i = 0; i < ant.length; i++) {
            System.out.print(ant[i] + " ");
        }
        System.out.println();

        int temp = ant[ant.length - 1];
        for (int i = ant.length - 2; i >= 0; i--) {
            ant[i + 1] = ant[i];
        }
        ant[0] = temp;
        for (int i = 0; i < ant.length; i++) {
            System.out.print(ant[i] + " ");
        }
    }

}
