package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;
import java.util.* ; 

public class populating_next_right_pointer_eachnode__6 {
    
}

//leetcode problem 116




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


class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root ; 
        }
        Queue<Node> que = new LinkedList<>()  ; 
        que.add(root) ; 
        root.next = null ; 

        while(!que.isEmpty()){
            int levelSize = que.size() ; 
            for ( int i = 0 ;i < levelSize ; i++){
                Node currNode = que.poll() ; 
                if(currNode.left != null){
                    que.add(currNode.left) ; 
                }
                if(currNode.right != null){
                    que.add(currNode.right) ;
                }
            }
            Queue<Node> temp = new LinkedList<>() ; 
            while(!que.isEmpty()){
                Node a = que.poll() ; 
                a.next = que.peek() ; 
                temp.add(a) ; 
            }

            while(!temp.isEmpty()){
                Node a = temp.poll() ; 
                que.add(a) ; 
            }


        }

        return root ; 
    }
}

//leetcode problem 116




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


class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root ; 
        }
        Queue<Node> que = new LinkedList<>()  ; 
        que.add(root) ; 
        root.next = null ; 

        while(!que.isEmpty()){
            int levelSize = que.size() ; 
            for ( int i = 0 ;i < levelSize ; i++){
                Node currNode = que.poll() ; 
                if(currNode.left != null){
                    que.add(currNode.left) ; 
                }
                if(currNode.right != null){
                    que.add(currNode.right) ;
                }
            }
            Queue<Node> temp = new LinkedList<>() ; 
            while(!que.isEmpty()){
                Node a = que.poll() ; 
                a.next = que.peek() ; 
                temp.add(a) ; 
            }

            while(!temp.isEmpty()){
                Node a = temp.poll() ; 
                que.add(a) ; 
            }


        }

        return root ; 
    }
}


//TInme complexity O(n)
//Space complexity O(n)