package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;
import java.util.* ; 

public class Flattern_binary_tree__13 {
    
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Queue<TreeNode> que = new LinkedList<>() ;
    public void flatten(TreeNode root) {
        if(root == null){
            return ; 
        }
        
        storeInQue(root) ; 
        while(!que.isEmpty()){
            TreeNode currNode = que.poll() ; 
            currNode.right = que.peek() ; 
            currNode.left = null ; 
        }

       
    }

    void storeInQue(TreeNode node){
        if(node == null){
            return ; 
        }
        que.add(node) ; 
        storeInQue(node.left) ; 
        storeInQue(node.right) ; 
    }
}


//?Time complexity 
// sotreInQueue , Performs a preorder traversal of the tree, visiting each node once. At each node, the add operation of the queue takes O(1) .For n nodes in the tree, this function takes )(n) time 

//faltten(TreeNode root ) Iterates through the queue (which contains n node) . for each peek , poll these takes O(1) time and overall loop takes O(n) time 

//? Overall time complexity ==> O(n) + O(n) === O(n)

//?Space complexity 
//Queue storage ==> in wrost case queue stores n nodes , sapce ==> O(n)

//Recursice call stack , for balances tree O(logn) == depth , for skewed O(n)
// Total = O(n)