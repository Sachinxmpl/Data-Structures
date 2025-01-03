package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

public class Maximum_depth_binary_tree {
    
}

//leetcode 104 
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
    public int maxDepth2(TreeNode root) {
        if(root == null){
            return -1 ; 
        }

        return maxDepth(root) ; 
    }

    int maxDepth(TreeNode node){
        if(node == null){
            return 0 ; 
        }

        int left = maxDepth(node.left) ; 
        int right = maxDepth(node.right); 

        return Math.max(left , right) + 1 ; 
    }
}