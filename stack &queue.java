import java.util.*;

public class StackQueueDemo {
    public static void main(String args[]) {
        // Stack (LIFO)
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println("Stack: " + st);
        System.out.println("Pop: " + st.pop());

        // Queue (FIFO)
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        System.out.println("Queue: " + q);
        System.out.println("Poll: " + q.poll());
    }
}
