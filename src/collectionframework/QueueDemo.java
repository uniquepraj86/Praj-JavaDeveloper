package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
// add return exception
//  offer returns the head of this queue
//element returns the exception
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> list = new PriorityQueue<>();
//        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.peek()); //it returns null when  queue is empty
        System.out.println(list.poll()); // it returns head or null when queue is empty
        System.out.println(list.element()); //it returns exception when queue is empty
        System.out.println(list.remove()); //it returns exception when queue is empty
        System.out.println(list.offer(9));
        System.out.println(list);
    }
}