package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

import java.util.*;

public class Binary_tree_level_order_traversal__1 {

}




//leetcode problem 102
//https://leetcode.com/problems/binary-tree-level-order-traversal/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);


        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = que.poll();
                temp.add(currNode.val) ; 
                if (currNode.left != null) {
                    que.add(currNode.left);
                }
                if (currNode.right != null) {
                    que.add(currNode.right);
                }
            }
            if (!temp.isEmpty()) {
                ans.add(temp);
            }
        }
        return ans;
    }
}


//Time 
//Each node is visited exactly once udring traversal 
//adding to queue O(1)
//time complexity O(n)


//Space 
//queue holds nodes by level 
// queue holds all nodes of a level at a time 
//worst case maximum nodes in level ==  n/2  n is total nodex

//so space O(n/2)