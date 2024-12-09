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
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        ans.add(temp);

        while (!que.isEmpty()) {
            int size = que.size();

            List<Integer> temp2 = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = que.poll();
                if (currNode.left != null) {
                    temp2.add(currNode.left.val);
                    que.add(currNode.left);
                }
                if (currNode.right != null) {
                    temp2.add(currNode.right.val);
                    que.add(currNode.right);
                }
            }
            if (!temp2.isEmpty()) {
                ans.add(temp2);
            }
        }
        return ans;
    }
}