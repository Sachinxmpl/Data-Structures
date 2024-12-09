package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

import java.util.*;

public class Average_of_levels_Binary_tree__2 {

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            int levelSize = que.size();
            double sum = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = que.poll();
                sum = sum + currNode.val;
                if (currNode.left != null) {
                    que.add(currNode.left);
                }
                if (currNode.right != null) {
                    que.add(currNode.right);
                }
            }
            double avg = sum / (levelSize);
            result.add(avg);
        }

        return result;
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