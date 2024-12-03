package non_linear_dataStructures.trees.AVLtrees;

public class AVL {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int val) {
            this.value = val;
        }

        public int getValue() {
            return this.value;
        }
    }

    private Node root;

    public int height() {
        return height(root);
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // insertion AVL
    public void insert(int val) {
        root = insert(val, root);
    }

    public Node insert(int value, Node node) {
        if (node == null) {
            return node;
        }
        if (value > node.value) {
            insert(value, node.right);
        }
        if (value < node.value) {
            insert(value, node.left);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if ((height(node.left) - height(node.right)) > 1) {
            if ((height(node.left.left) - height(node.left.right)) > 0) {
                // left-left case
                rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if ((height(node.left) - height(node.right)) < -1) {
            // right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // right right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // left right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    // check if tree is balanced or not
    public boolean balanced() {
        return balanced(root);
    }

    public boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        int diff = Math.abs(height(node.left) - height(node.right));

        return (diff <= 1) && balanced(node.left) && balanced(node.right);
    }

    // display
    public void display() {
        display(root, "Root Node : ");
    }

    public void display(Node node, String detail) {
        if (node == null) {
            return;
        }
        System.out.println(detail + node.value);
        display(node.left, "Left node of " + node.value + " : ");
        display(node.right, "right node of " + node.value + " : ");
    }
}
