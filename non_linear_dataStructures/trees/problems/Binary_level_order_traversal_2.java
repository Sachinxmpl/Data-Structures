package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

import java.util.*;

public class Binary_level_order_traversal_2 {

}

//Leetcode problem 107 

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            int levelsize = que.size();
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode currNode = que.poll();
                ans.add(currNode.val);

                if (currNode.left != null) {
                    que.add(currNode.left);
                }
                if (currNode.right != null) {
                    que.add(currNode.right);
                }
            }
            if (!ans.isEmpty()) {
                result.add(0, ans);
            }
        }

        return result;
    }
}