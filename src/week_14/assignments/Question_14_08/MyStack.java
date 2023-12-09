package week_14.assignments.Question_14_08;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private int x;
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public MyStack() {
        this(1);
    }

    public MyStack(int x) {
        this.x = x;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void push(int x) {

        this.queue1.offer(x);
    }

    public int getSize() {
        return queue1.size();
    }

    public int pop() {
        int number;

        if (!queue1.isEmpty()) {

            while (this.queue1.size() != 1) {

                this.queue2.offer(this.queue1.poll());
            }
        }
        number = this.queue1.element();
        queue1.poll();

        if (!queue2.isEmpty()) {

            while (!queue2.isEmpty()) {

                this.queue1.offer(this.queue2.poll());
            }
        }
        return number;
    }

    public boolean empty() {
        if (this.queue1.isEmpty()) {

            return true;
        } else {

            return false;
        }
    }

    public int top() {
        int number;

        if (!queue1.isEmpty()) {

            while (this.queue1.size() != 1) {

                this.queue2.offer(this.queue1.poll());
            }
        }
        number = this.queue1.element();
        this.queue2.offer(this.queue1.poll());

        if (!queue2.isEmpty()) {

            while (!queue2.isEmpty()) {

                this.queue1.offer(this.queue2.poll());
            }
        }
        return number;
    }

    @Override
    public String toString() {
        return "stack: " + queue1.toString();
    }
}
