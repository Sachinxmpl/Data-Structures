package Data_Structures_and_algorithms.non_linear_dataStructures.trees.problems;

import java.util.*;

public class Level_order_sucessort__3 {

}


//geeks for geeks 
//https://www.geeksforgeeks.org/level-order-successor-of-a-node-in-binary-tree/

// Java program to find Levelorder
// successor of given node in the
// Binary Tree

class GfG {
    // Tree Node
    static class Node {
        Node left, right;
        int value;
    }

    // Utility function to create a
    // new node with given value
    static Node newNode(int value) {
        Node temp = new Node();
        temp.left = null;
        temp.right = null;
        temp.value = value;

        return temp;
    }

    // Function to find the Level Order Successor
    // of a given Node in Binary Tree
    static Node levelOrderSuccessor(Node root, Node key) {
        if (root == null) {
            return root;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node curr = que.poll();
            if (curr.left != null) {
                que.add(curr.left);
            }
            if (curr.right != null) {
                que.add(curr.right);
            }
            if (curr == key) {
                break;
            }

        }

        return que.peek();
    }

    // Driver code
    public static void main(String[] args) {
        Node root = newNode(20);
        root.left = newNode(10);
        root.left.left = newNode(4);
        root.left.right = newNode(18);
        root.right = newNode(26);
        root.right.left = newNode(24);
        root.right.right = newNode(27);
        root.left.right.left = newNode(14);
        root.left.right.left.left = newNode(13);
        root.left.right.left.right = newNode(15);
        root.left.right.right = newNode(19);

        Node key = root.right.left; // node 24

        Node res = levelOrderSuccessor(root, key);

        if (res != null)
            System.out.println("LevelOrder successor of "
                    + key.value + " is " + res.value);
        else
            System.out.println("LevelOrder successor of "
                    + key.value + " is NULL");

    }
}


//time O(N) 
//space O(n)