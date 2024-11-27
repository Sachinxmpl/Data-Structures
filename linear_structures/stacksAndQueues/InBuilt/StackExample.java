package linear_structures.stacksAndQueues.InBuilt;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for  ( int i = 0 ;i < 4 ; i++){
            stack.push(i+4);
        }
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
