package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

public class Cousins_in_binaryTree__8 {
    
}

//leetcode 993 
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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null || root.val == x || root.val == y){
            return false; 
        }

        TreeNode node1 = getNode(root , x ) ; 
        TreeNode node2 = getNode(root , y ) ; 

        int lvlx = getLevel(root ,node1 , 0  ) ; 
        int lvly = getLevel(root  ,node2 , 0) ; 

        return ((lvlx == lvly) && (!isSiblings(root , node1 , node2)));

    }

    boolean isSiblings(TreeNode node , TreeNode node1 , TreeNode node2){
        if(node == null){
            return false ; 
        }

        boolean ans = (node.left == node1 && node.right == node2) || (node.left == node2 && node.right == node1) ; 

        return ans || isSiblings(node.left , node1 , node2) || isSiblings(node.right , node1 , node2) ; 
    }


    int getLevel(TreeNode node , TreeNode x , int level){
        if(node == null){
            return -1 ; 
        }
        if(node == x){
            return level ; 
        }

        int ans = getLevel(node.left , x , level + 1) ; 
        if(ans != -1){
             return ans ; 
        }

        return getLevel(node.right , x , level + 1) ; 
    }

    TreeNode getNode(TreeNode node , int val){
        if(node == null){
            return node ; 
        }
        if(node.val == val){
            return node ; 
        }

        TreeNode ans = getNode(node.left , val) ; 
        if(ans == null){
            ans = getNode(node.right , val) ; 
        }

        return ans ; 
    }
}