package non_linear_dataStructures.trees.binary_search_tree;

public class BinarySearchTree {
    public class Node {
        private int value;
        public Node left;
        public Node right;
        private int height;

        public Node(int val) {
            this.value = val;
            this.height = 0;
        }

        public int getVal(Node node) {
            return node == null ? -1 : node.value;
        }
    }

    Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // Insertion takes O(logn) time in case of balances binary tree
    // We are comparing one at each level
    // No of level = logn in Balance BST
    // so O(logn)
    public void insert(int val) {
        root = insert(val, root);
    }

    public Node insert(int value, Node node) {
        if (node == null) {
            Node newnNode = new Node(value);
            return newnNode;
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    // insert when input array is sorted
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length - 1);
    }

    public void populateSorted(int[] nums, int s, int e) {
        if (s > e) {
            return ; 
        }
        int m = s + (e - s) / 2;
        this.insert(nums[m]);
        populateSorted(nums, s, m - 1);
        populateSorted(nums, m + 1, e);
    }

    // Display the tree
    public void display() {
        display("Root value is ", this.root);
    }

    public void display(String details, Node node) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);

        display("Left child of " + node.value + ":", node.left);
        display("Right child of " + node.value + ":", node.right);

    }

}
