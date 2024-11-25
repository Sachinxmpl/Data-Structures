package dynamic_linear_structures.linkedList.problems;

public class InsertRecursion {
    private int size ; 
    public InsertRecursion(){
        this.size = 0 ; 
    }
    private Node head ; 




    //insert using recursion
    public void insertRec(int val , int index){
        head = insertRecursively(val, index, head);
    }

    //time O(N)
    //space O(N)
    private Node insertRecursively(int val ,  int index , Node node){
        if(index == 0){
            Node temp = new Node(val , node);
            size ++ ; 
            return temp ; 
        }

        node.next = insertRecursively(val, index=index-1, node.next);
        return node ; 
    }





    public void displayNode(){
        Node temp  = head ; 
        while(temp != null){
            System.out.print(temp.value + " ~> ");
            temp = temp.next ; 
        }
        System.out.println("null");
    }

    private class Node{
        private int value ; 
        private Node next ; 

        public Node(int value){
            this.value = value ; 
            this.next = null ; 
        }
        public Node(int value , Node next){
            this.next = next ; 
            this.value = value ; 
        }
    }
}
