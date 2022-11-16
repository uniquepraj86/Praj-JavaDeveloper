package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * Deque - Double Ended queu
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> list =new ArrayDeque<>();
        list.add(10);
        list.offer(20);
        list.addFirst(30);
        list.addLast(40);
        System.out.println(list);

//        System.out.println(list.peek());
//        System.out.println(list.pop());
//        System.out.println(list.poll());
//        System.out.println(list.pollFirst());
//        System.out.println(list.pollLast());
        System.out.println(list.remove());
        System.out.println(list.removeLast());


    }
}
