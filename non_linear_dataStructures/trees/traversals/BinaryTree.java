package non_linear_dataStructures.trees.traversals;

import java.util.Scanner;


public class BinaryTree {
    public Node root ; 
    
    //insert the elements
    public void populate(){
        System.out.println("Enter the root node value");
        Scanner sc  = new Scanner(System.in);
        int val = sc.nextInt();
        root = new Node(val);
        populate(root , sc);
    }
    public void populate(Node node , Scanner sc){
        if(node == null){
            return ; 
        }
        System.out.println("Do you want to enter to left");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Number");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            node.left = newNode;
            populate(newNode , sc);
        }

        System.out.println("Do you want to enter to right");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Number");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            node.right = newNode;
            populate(newNode , sc);
        }

    }


    //preorder traversals
    public void preOrderTraversal(Node node){
        if(node == null){
            return ; 
        }

        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }


    //inorder traversals 
    public void inOrderTraversal(Node node){
        if(node == null){
            return ; 
        }

        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

     //post traversals 
     public void postOrderTraversal(Node node){
        if(node == null){
            return ; 
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }

    private class Node{
        int value ; 
        Node left ; 
        Node right ; 
        int height ; 

        public Node(int value){
            this.value = value ; 
            this.height = 0 ; 
        }
    }
}
