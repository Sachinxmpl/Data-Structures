package linear_structures.stacksAndQueues.problems;

import java.util.Stack;

public class queueUsingStack__1 {
    
}

//Implement queue using only two stack 
//leetcode problem 232 
//https://leetcode.com/problems/implement-queue-using-stacks/


class MyQueue {
    Stack<Integer> sc = new Stack<Integer>() ; 
    Stack<Integer> sc2 = new Stack<Integer>() ; 
    public MyQueue() {
        
    }
    
    //O(1)
    public void push(int x) {
        sc.push(x) ; 
    }
    

    //O(n)
    public int pop() {
        if(sc2.isEmpty()){
            while(!sc.isEmpty()){
                int x = sc.pop() ; 
                sc2.push(x) ; 
            }
        }
        return sc2.pop() ; 
    }

    public int peek() {
         if(sc2.isEmpty()){
            while(!sc.isEmpty()){
                int x = sc.pop() ; 
                sc2.push(x) ; 
            }
        }
        return sc2.peek() ; 
    }
    
    public boolean empty() {
        return sc.isEmpty() && sc2.isEmpty(); 
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