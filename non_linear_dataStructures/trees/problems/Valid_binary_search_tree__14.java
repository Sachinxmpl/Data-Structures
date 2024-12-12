package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;
import java.util.* ;

public class Valid_binary_search_tree__14 {
    
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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true ; 
        }

        storeInQue(root) ;

        //check queue is sorted
        while(!que.isEmpty()){
            TreeNode curr = que.poll() ; 
            TreeNode next = que.peek() ; 

            if(next != null && curr.val >= next.val){
                return false ; 
            }
        }

        return true ; 
    }

    void storeInQue(TreeNode node){
        if(node == null){
            return ; 
        }

        storeInQue(node.left) ; 
        que.add(node) ; 
        storeInQue(node.right) ; 
    }
}