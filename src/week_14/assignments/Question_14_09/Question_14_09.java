package week_14.assignments.Question_14_09;

public class Question_14_09 {
    public static void main(String[] args) {

        System.out.println("Use the offer method to initialize the queue...");
        MyQueue myQueue = getMyQueue();
        System.out.println(myQueue);
        System.out.println("\nAfter a poll method...");
        myQueue.poll();
        System.out.println(myQueue);
        System.out.println("\nLet's use the poll method two more times and peek at the head of the queue...");
        myQueue.poll();
        myQueue.poll();
        System.out.println(myQueue.element());
        System.out.println("\nCheck the queue whether is empty? " + myQueue.empty());
        System.out.println("\nOk then let's make it empty, use the poll method two more times and show each element that we poll...");
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println("\nCheck the queue whether is empty? " + myQueue.empty());
    }

    public static MyQueue getMyQueue() {

        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < 5; i++) {

            myQueue.offer((int) (25 + Math.random() * 50));
        }
        return myQueue;
    }
}
