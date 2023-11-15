package week_11.assignments.Question_11_10;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack extends ArrayList<Objects> {
    private ArrayList<Object> list = new ArrayList<>();
    public MyStack(){

    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(getSize()-1);
    }
    public Object pop(){
        //return list.remove(get((getSize()-1)));
        Object o = list.get(getSize()-1);
        list.remove(getSize()-1);
        //list.remove(o);
        return o;
    }
    public void push(Object o){
        list.add(o);
    }
    @Override
    public String toString(){
        return "stack: " + list.toString();
    }

}
