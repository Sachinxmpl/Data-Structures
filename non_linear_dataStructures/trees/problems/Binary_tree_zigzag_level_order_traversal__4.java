package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

import java.util.*;

public class Binary_tree_zigzag_level_order_traversal__4 {

}

// leetcode problem 103

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        boolean forward = true;

        while (!que.isEmpty()) {
            int levelSize = que.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = que.poll();
                if (forward) {
                    temp.add(curr.val);
                } else {
                    temp.add(0, curr.val);
                }
                if (curr.left != null) {
                    que.add(curr.left);
                }
                if (curr.right != null) {
                    que.add(curr.right);
                }
            }
            if (!temp.isEmpty()) {
                result.add(temp);
            }
            forward = !forward;
        }

        return result;
    }
}