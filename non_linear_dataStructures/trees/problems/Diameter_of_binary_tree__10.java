package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems; 

public class Diameter_of_binary_tree__10 {
    
}


//leetcode diameter of binary tree problem 
// time O(n) space O(n)
//uses post-order traversal left-->right --> root

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
    int diameter = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0 ; 
        } 
        helper(root) ;
        return diameter; 
    }

    int helper(TreeNode node){
        if(node == null){
            return -1 ; 
        }

        int leftheight = helper(node.left) ; 
        int rightheight = helper(node.right) ; 

        diameter = Math.max(diameter , leftheight + rightheight + 2) ; 

        return Math.max(leftheight , rightheight) + 1 ; 
    }
}