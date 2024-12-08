package linear_structures.stacksAndQueues.problems;

import java.util.Stack;

public class push_at_bottom {
   public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>() ; 

        insertAtBottom(10 , sc) ; 
        insertAtBottom(230,sc);
        insertAtBottom(140, sc) ; 
        insertAtBottom(500,sc);
        insertAtBottom(12,sc);
        System.out.println(sc);

   }
   //time O(n) space O(n)
   static void insertAtBottom(int val , Stack<Integer>sc){
        if(sc.empty()){
            sc.push(val) ; 
            return ; 
        }
        int curr = sc.pop() ; 
        insertAtBottom(val, sc);
        sc.push(curr) ; 
   }
}
