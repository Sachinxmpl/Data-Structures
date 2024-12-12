package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

public class Flattern_binary_tree2__13 {
    
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
    public void flatten(TreeNode root) {
        if(root == null){
            return  ; 
        }
        TreeNode temp = root ; 
        while(temp != null){
            if(temp.left != null){
                TreeNode test = temp.left ; 
                while(test.right != null){
                    test = test.right ; 
                }
                test.right = temp.right ; 
                temp.right = temp.left ; 
                temp.left = null ; 
            }

            temp = temp.right ; 
        }
    }
}


//! Time complexity of this code O(n)
//! Space complexity O(1)