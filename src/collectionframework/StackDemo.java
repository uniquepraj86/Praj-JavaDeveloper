package collectionframework;
//last in first out  === queu
import java.util.Stack;
//  push ,pop,search,peek
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.pop());  //remove the peek
        System.out.println(list.peek()); //  it returns the head
        list.add(2,25);
        System.out.println(list);
        System.out.println(list.search(30));


    }
}
