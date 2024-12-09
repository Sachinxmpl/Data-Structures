package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;
import java.util.* ; 

public class populating_next_right_pointer_eachnode2__6 {
    
}


/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root ;
        }

        Node temp = root ; 

        while(temp.left != null){
            Node current = temp ;
            while(current != null){
                current.left.next = current.right ; 
                if(current.next != null){
                    current.right.next = current.next.left ; 
                }
                current = current.next ; 
            }
            temp = temp.left ; 
        }

        return root ; 
    }
}


//time o(n)
//space O(1)