package week_07.live_class;

public class ProcessingNumber_8_ShiftingElements {
    public static void main(String[] args) {
        int[] rainFalls = {12, 45, 789, 3, 4, 8, 17};
        for (int i = 0; i < rainFalls.length; i++) {
            System.out.print(rainFalls[i] + " ");
        }
        System.out.println();
        // Retain the first element
        int temp = rainFalls [0];

        // Shift elements left
        for (int i = 1; i < rainFalls.length ; i++) {
            rainFalls[i - 1] = rainFalls[i];
        }

        // Move the first element to fill in the last position
        rainFalls[rainFalls.length - 1] = temp;

        for (int i = 0; i < rainFalls.length; i++) {
            System.out.print(rainFalls[i] + " ");
        }
    }

}
