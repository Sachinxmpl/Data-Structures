import java.util.*;

public class kth_smallest_element {

}

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
    public int kthSmallest(TreeNode root, int k) {
        Queue<Integer> que = new LinkedList<>();
        store(que, root);
        while (k > 1) {
            que.poll();
            k--;
        }

        return que.peek();
    }

    void store(Queue<Integer> que, TreeNode node) {
        if (node == null) {
            return;
        }
        store(que, node.left);
        que.add(node.val);
        store(que, node.right);
    }
}