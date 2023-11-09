package week_10.assignments.Question_10_10;

public class Question_10_10 {
    public static void main(String[] args) {

        Queue cinema = new Queue();
        for (int i = 1; i < 21; i++) {
            cinema.enQueue(i);
            System.out.print(i + " ");
        }


        System.out.println("\n\nProcess of Dequeue : ");
        for (int i = 0; i < 20; i++) {
            System.out.print(cinema.peek() + " ");
            cinema.deQueue();
        }
    }
}
