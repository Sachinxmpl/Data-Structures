package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;
import java.util.* ; 

public class binary_tree_right_size_view__7 {
    
}
//leetcode problem 199 



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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>() ; 
        if(root == null){
            return result ; 
        }

        Deque<TreeNode> que = new LinkedList<>() ; 
        que.add(root) ; 
        
        while(!que.isEmpty()){
            int lvl = que.size() ; 
            result.add(que.getLast().val) ; 
            for ( int i = 0 ;i < lvl ; i++){
                TreeNode currNode = que.removeFirst() ; 
                if(currNode.left != null){
                    que.offerLast(currNode.left) ; 
                }
                if(currNode.right != null){
                    que.offerLast(currNode.right) ; 
                }
            }
        }

        return result  ; 

    }
}