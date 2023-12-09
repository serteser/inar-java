package week_14.assignments.Question_14_09;

import java.util.Stack;

public class MyQueue {
    private int x;
    private Stack<Object> stack1 = new Stack<>();
    private Stack<Object> stack2 = new Stack<>();

    public MyQueue() {
        this(1);
    }

    public MyQueue(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void offer(int x) {
        stack1.push(x);
    }

    public int poll() {

        int val = -1;
        if (!stack1.isEmpty()) {

            while (!stack1.isEmpty()) {

                stack2.push(stack1.pop());
            }
            val = (int) stack2.peek();
            stack2.pop();
        }
        if (!stack2.isEmpty()) {

            while (!stack2.isEmpty()) {

                stack1.push(stack2.pop());
            }
        }
        return val;
    }

    public int element() {
        int val = -1;
        if (!stack1.isEmpty()) {

            while (!stack1.isEmpty()) {

                stack2.push(stack1.pop());
            }
            val = (int) stack2.peek();
        }
        if (!stack2.isEmpty()) {

            while (!stack2.isEmpty()) {

                stack1.push(stack2.pop());
            }
        }
        return val;
    }

    public int getSize() {
        return stack1.size();
    }

    public boolean empty() {

        if (!stack1.isEmpty()) {

            return false;
        } else {

            return true;
        }
    }

    @Override
    public String toString() {
        return "queue: " + stack1.toString();
    }
}
