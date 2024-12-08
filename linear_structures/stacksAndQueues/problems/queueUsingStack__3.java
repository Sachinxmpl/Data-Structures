package linear_structures.stacksAndQueues.problems;

import java.util.*;

public class queueUsingStack__3 {

}


//leetocde problem 232 
//exit optimized queue using two stacks 
// push() ==> O(n) time and constant space 

//pop() and peek() takes constant time and space 

class MyQueue {
    Stack<Integer> sc = new Stack<Integer>();
    Stack<Integer> sc2 = new Stack<Integer>();

    public MyQueue() {

    }

    public void push(int x) {
        while (!sc.isEmpty()) {
            int y = sc.pop();
            sc2.push(y);
        }
        sc2.push(x);
        while (!sc2.isEmpty()) {
            int y = sc2.pop();
            sc.push(y);
        }
    }

    public int pop() {
        return sc.pop();
    }

    public int peek() {
        return sc.peek();
    }

    public boolean empty() {
        return sc.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */