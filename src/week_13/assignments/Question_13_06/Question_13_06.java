package week_13.assignments.Question_13_06;

public class Question_13_06 {
    public static void main(String[] args) {

        ComparableCircle comparableCircle1 = new ComparableCircle(16.5, "blue", true);
        ComparableCircle comparableCircle2 = new ComparableCircle(20.3, "purple", true);

        System.out.println("ComparableCircle1: \n" + comparableCircle1);
        System.out.println("\nComparableCircle2: \n" + comparableCircle2);

        System.out.print(comparableCircle1.compareTo(comparableCircle2) > 0 ? "\nComparableCircle1" : "\nComparableCircle2" + " is the larger of two Circles");
    }
}
