package linear_structures.stacksAndQueues.problems;

import java.util.Stack;

public class push_at_bottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(32);
        s.push(43);
        s.push(2342);
        System.out.println(s.size());
    }

    static void insertLast(int x , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(x);
            return ; 
        }
        int val = s.pop();
        insertLast(x, s);
        s.push(val);
    }
}
