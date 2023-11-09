package week_10.assignments.Question_10_10;

public class Queue {
    private int[] elements; // stores the int values in the queue
    private int size; // stores number of elements in the queue

    public Queue() {
        elements = new int[8];
    }

    public void enQueue(int v) { // adds v into the queue
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;

    }

    public void deQueue() { // removes and returns the element from the queue
        //int temp = elements[size-1];
        //elements[0] = 0;
        for (int i = 1; i < elements.length; i++) {
            elements[i-1]= elements[i];
        }
        //elements[0]=temp;
        //elements[--size];
        size--;
    }

    public int getSize() {
        return size;
    }

    public boolean empty() {
        return (size == 0);
    }
    public int peek() {
        return elements[0];
    }
}
