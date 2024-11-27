package linear_structures.stacksAndQueues.part1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueueExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
    }
}


// public interface Deque<E> extends Queue<E>, SequencedCollection<E> {
//     void addFirst(E var1);
 
//     void addLast(E var1);
 
//     boolean offerFirst(E var1);
 
//     boolean offerLast(E var1);
 
//     E removeFirst();
 
//     E removeLast();
 
//     E pollFirst();
 
//     E pollLast();
 
//     E getFirst();
 
//     E getLast();
 
//     E peekFirst();
 
//     E peekLast();
 
//     boolean removeFirstOccurrence(Object var1);
 
//     boolean removeLastOccurrence(Object var1);
 
//     boolean add(E var1);
 
//     boolean offer(E var1);
 
//     E remove();
 
//     E poll();
 
//     E element();
 
//     E peek();
 
//     boolean addAll(Collection<? extends E> var1);
 
//     void push(E var1);
 
//     E pop();
 
//     boolean remove(Object var1);
 
//     boolean contains(Object var1);
 
//     int size();
 
//     Iterator<E> iterator();
 
//     Iterator<E> descendingIterator();
 
//     default Deque<E> reversed() {
//        return ReverseOrderDequeView.of(this);
//     }
//  }
 