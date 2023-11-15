package week_11.live_class.StackOfStudy;

public class StackOfStudyTest {
    public static void main(String[] args) {

        StackOfStudy list = new StackOfStudy();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.empty());
        System.out.println(list.getSize());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
        System.out.println(list.peek());
    }

}
