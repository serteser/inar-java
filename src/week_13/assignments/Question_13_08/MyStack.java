package week_13.assignments.Question_13_08;

import java.util.ArrayList;

public class MyStack implements Cloneable {

    private ArrayList<Object> list;

    public MyStack() {
    list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int getSize() {
        return this.list.size();
    }

    public Object peek() {
        return this.list.isEmpty() ? null : this.list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object o = this.list.get(getSize() - 1);
        this.list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        this.list.add(o);
    }

    @Override
    public String toString() {
        return this.list.toString();
    }

    @Override
    public MyStack clone() {
        try {
            MyStack clone = (MyStack) super.clone();
            clone.list= (ArrayList<Object>) list.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
