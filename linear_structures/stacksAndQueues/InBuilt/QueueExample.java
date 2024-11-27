package linear_structures.stacksAndQueues.InBuilt;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(9);
        queue.add(30);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
    }
}
