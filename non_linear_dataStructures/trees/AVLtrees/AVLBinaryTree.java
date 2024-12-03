package non_linear_dataStructures.trees.AVLtrees;

public class AVLBinaryTree{
    Node root ; 
    public int Height(){
        return Height(root);
    }
    public int Height(Node node){
        if(node == null){
            return -1 ; 
        }
        return node.height ; 
    }
    
    public void insert(int val){
        root = insert(val , root);
    }
    public Node insert(int val , Node node){
        if(node == null){
            Node newNode = new Node(val);
            return newNode ; 
        }
        if(val > node.value){
            node.right = insert(val , node.right);
        }
        if(val < node.value){
            node.left = insert(val , node.left);
        }
        node.height = Math.max(Height(node.left) , Height(node.right)) + 1 ; 
        return rotate(node) ; 
    }
    public Node rotate(Node node){
        if(Height(node.left) - Height(node.right) > 1){
            if((Height(node.left.left) - Height(node.left.right)) > 0){
                return rightRotate(node);
            }
            if((Height(node.left.left) - Height(node.left.right)) < 0){
                node.left =  leftRotate(node);
                return rightRotate(node);
            }
        }
        if(Height(node.right) - Height(node.left) > 1){
            if((Height(node.right.right) - Height(node.right.left)) > 0){
                return leftRotate(node);
            }
            if((Height(node.right.right) - Height(node.right.left)) < 0){
                node.right =  rightRotate(node);
                return leftRotate(node);
            }
        }
        
        return node ; 
    }
    
    
    public Node rightRotate(Node node){
        Node p = node ; 
        Node c = node.left ; 
        Node t = c.right ; 
        
        c.right = p ; 
        p.left = t ; 
        
        c.height = Math.max(Height(c.left) , Height(c.right)) + 1 ;
        p.height = Math.max(Height(p.left) , Height(p.right)) + 1 ; 
        
        return c;
    }
    
    public Node leftRotate(Node node){
        Node p = node ; 
        Node g = node.right ; 
        Node t = g.left ; 
        
        g.left = p ; 
        p.right = t ; 
        
         p.height = Math.max(Height(p.left) , Height(p.right)) + 1 ;
        g.height = Math.max(Height(g.left) , Height(g.right)) + 1 ; 
        
        return g  ;
    }
    
    
    
    public boolean isBalanced(){
        return isBalanced(root);
    }
    public boolean isBalanced(Node node){
        if(node == null){
            return true ; 
        }
        boolean xyz = Math.abs(Height(node.left)-Height(node.right)) <=1;
        
        return xyz && isBalanced(node.left) && isBalanced(node.right);
    }
    
    
    
    
    
    
    public void display(){
        display(root , "Root node is : ");
    }
    public void display(Node node , String indent){
        if(node == null){
            return ;
        }
        System.out.println(indent + node.value);
        display(node.left , "Left node of " + node.value + " is ");
        display(node.right , "Right node of " + node.value + " is ");
    }
    
    
    class Node{
        int value ; 
        Node left ; 
        Node right ; 
        int height ; 
        
        public Node(int value){
            this.value = value ; 
        }
        
    }
}