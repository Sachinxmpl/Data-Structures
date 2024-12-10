package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

public class Sorted_array_to_bst__12 {
    
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
    TreeNode root ; 
    public TreeNode sortedArrayToBST(int[] nums) {
        populateSorted(nums , 0 , nums.length-1) ; 
        return root  ; 
    }

    void populateSorted(int[] nums , int s , int e){
        if(s > e){
            return ; 
        }
        int mid = s + (e-s) / 2; 
        root = insert(nums[mid] , root) ; 
        populateSorted(nums , s , mid-1) ; 
        populateSorted(nums , mid + 1 , e) ; 
    }

    TreeNode insert(int val , TreeNode node){
        if(node == null){
            TreeNode newNode = new TreeNode(val) ; 
            return newNode; 
        }
        if(val > node.val){
            node.right = insert(val , node.right) ; 
        }
        if(val < node.val){
            node.left = insert(val , node.left) ; 
        }

        return node ; 
    }

}