package non_linear_dataStructures.trees.segment_tree;

public class SegmentTree {
    Node root;

    
    // construct tree time complexity O(n) to make each node  Space complexity to store array as tree O(n) and for recursion stack O(logn)  overall O(n) + O(logn)

    public void constructTree(int[] nums) {
        this.root = constructTree(nums, 0, nums.length - 1);
    }
    public Node constructTree(int[] nums, int s, int e) {
        if (s == e) {
            Node leafNode = new Node(s, e);
            leafNode.value = nums[s];
            return leafNode;
        }
        int m = s + (e - s) / 2;
        Node newnode = new Node(s, e);
        newnode.left = constructTree(nums, s, m);
        newnode.right = constructTree(nums, m + 1, e);
        newnode.value = newnode.left.value + newnode.right.value;

        return newnode;
    }

    // update the segment tree
    // this takes O(logn) time
    public void updateTree(int index, int val) {
        this.root.value = updateTree(root, index, val);
    }

    public int updateTree(Node node, int index, int val) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.value = val;
                return node.value;
            } else {
                int leftans = updateTree(node.left, index, val);
                int rightans = updateTree(node.right, index, val);
                node.value = rightans + leftans;
                return node.value;
            }
        }
        return node.value;
    }

    // Query data in range of r1 , r2 ;
    public int Query(int r1, int r2) {
        return this.Query(root, r1, r2);
    }

    public int Query(Node node, int r1, int r2) {
        if (node == null) {
            return 0;
        }
        // If the node range is completely within the query range
        if (node.startInterval >= r1 && node.endInterval <= r2) {
            return node.value;
        } // If the node range is completely outside the query range
        if (node.endInterval < r1 || node.startInterval > r2) {
            return 0;
        } else {
            return this.Query(node.left, r1, r2) + this.Query(node.right, r1, r2);
        }
    }





    
    // display output
    public void display() {
        display(root);
    }

    public void display(Node node) {
        String str = "";

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.value + " <= ";

        if (node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: "
                    + node.left.value + " => ";
        } else {
            str = str + "No left child";
        }

        if (node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: "
                    + node.right.value;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

    private class Node {
        int value;
        Node left;
        Node right;
        int startInterval;
        int endInterval;

        public Node(int start, int end) {
            this.startInterval = start;
            this.endInterval = end;
        }

    }
}
