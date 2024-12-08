package linear_structures.stacksAndQueues.problems;
import java.util.* ; 

public class queueUsingStack__2 {
    
}


//Implement queue using only one stack 


class MyQueue {

    Stack<Integer> sc  = new Stack<Integer>() ; 

    public MyQueue() {
        
    }
    

    //O(n) time and O(n) space 
    public void push(int x) {
        push_at_bottom(x , sc) ; 
    }
    
    void push_at_bottom(int x , Stack<Integer> sc){
        if(sc.isEmpty()){
            sc.push(x) ; 
            return ; 
        }
        int currValue = sc.pop() ; 
        push_at_bottom(x , sc) ; 
        sc.push(currValue) ; 
    }


    //O(1) time 
    public int pop() {
        return sc.pop() ; 
    }
    
    public int peek() {
        return sc.peek() ; 
    }
    
    public boolean empty() {
        return sc.isEmpty() ; 
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