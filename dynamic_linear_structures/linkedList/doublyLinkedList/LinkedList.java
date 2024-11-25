package dynamic_linear_structures.linkedList.doublyLinkedList;

public class LinkedList {
    private int size;
    private Node head;
    private Node tail; //lets not use tail 

    LinkedList() {
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode ; 
            head.previous = null ; 
            head.next = null;
            size+=1;
            return ; 
        }
        newNode.next = head ; 
        newNode.previous = null ; 
        head.previous = newNode ; 
        head = newNode ; 
        size+=1;
    }

    public void insertLast(int value){
        Node newNode = new Node(value);
        
        //move to last node 
        Node temp = head ;
        Node last = temp ; 
        while(temp != null){
            last = temp ; 
            temp = temp.next ; 
        }

        if(head == null){
            head = tail = newNode;
            head.previous = null ; 
            head.next = null ; 
            size ++ ; 
            return ; 
        }

        last.next = newNode;
        newNode.previous = last ; 
        newNode.next = null ;
        size ++ ; 

    }

    
    
    public Node getNode(int index){
        Node temp = head ; 
        for ( int i = 0 ; i < index ; i++){
            temp = temp.next ; 
        }
        return temp ; 
    }
    public int getNodeValue(int index){
        Node temp = head ; 
        for ( int i = 0 ; i < index ; i++){
            temp = temp.next ; 
        }
        return temp.value ; 
    }



    public void displayNode(){
        Node temp = head ; 
        while(temp != null){
            System.out.print(temp.value + " ~>");
            temp = temp.next ; 
        }

        System.out.println("null");
    }

    public void displayReverse(){
        Node temp = head ; 
        Node last = temp ; 
        
        //take last to tailNode
        while(temp != null){
            last = temp ; 
            temp = temp.next; 
        }
        System.out.print("null");
        while(last !=null){
            System.out.print(" <~ "+ last.value);
            last = last.previous ; 
        }
    }

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
