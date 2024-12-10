package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

public class Invert_binary_tree__11 {
    
}

//leetcode problem 226 
//https://leetcode.com/problems/invert-binary-tree/

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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root ; 
        }
        TreeNode left = invertTree(root.left) ; 
        TreeNode right = invertTree(root.right) ; 

        root.left = right ; 
        root.right = left ; 


        return root; 
    }
}

//time complexity O(n)
//space complexity O(n)