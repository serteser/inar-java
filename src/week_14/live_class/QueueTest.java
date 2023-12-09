package week_14.live_class;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //Integer[] number = {1,2,3,3,4,5,6,0};
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6,0));
        Collections.sort(list);
        System.out.println(list);

        queue.offer(23);
        queue.offer(33);
        queue.offer(43);
        queue.offer(53);
        queue.offer(63);
        System.out.println(queue);
    }
}
