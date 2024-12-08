package linear_structures.stacksAndQueues.problems;
import java.util.Stack; 

public class minStack__5 {
    
}

//leetcode problem 155 
//https://leetcode.com/problems/min-stack/description/

class MinStack{
    Stack<Integer> sc ; 
    Stack<Integer> sc2 ; 

    public MinStack(){
        sc = new Stack<>(); 
        sc2 = new Stack<>() ; 
    }

    public void push(int val){
        sc.push(val) ; 

        if(sc2.isEmpty() || val <= sc2.peek()){
            sc2.push(val) ; 
        }
    }

    public void pop(){
        int popped = sc.pop() ; 
        if(popped == sc2.peek()){
            sc2.pop() ; 
        }
    }

    public int getMinimum(){
        return sc2.peek() ; 
    }

}