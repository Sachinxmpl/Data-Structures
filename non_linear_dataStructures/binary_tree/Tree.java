package non_linear_dataStructures.binary_tree;

import java.util.*;

public class Tree {
    private Node root;

    // insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root node value");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node currNode) {
        System.out.println("Do you want to enter left of " + currNode.value);
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.println("Enter value on left of " + currNode.value);
            int val = sc.nextInt();
            currNode.left = new Node(val);
            populate(sc, currNode.left);
        }

        System.out.println("Do you want to enter right of " + currNode.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter value on right of " + currNode.value);
            int val = sc.nextInt();
            currNode.right = new Node(val);
            populate(sc, currNode.right);
        }
    }

    // display tree
    public void display() {
        display(root, "");
    }

    public void display(Node currNode, String indent) {
        if (currNode == null) {
            return;
        }
        System.out.println(indent + currNode.value);
        display(currNode.left, indent + "\t");
        display(currNode.right, indent + "\t");
    }

    // pretty display
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node curNode, int level) {
        if (curNode == null) {
            return;
        }
        prettyDisplay(curNode.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("-------->" + curNode.value);
        } else {
            System.out.println(curNode.value);
        }

        prettyDisplay(curNode.left, level + 1);
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }
    }

}
