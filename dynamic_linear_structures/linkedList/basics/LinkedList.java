package dynamic_linear_structures.linkedList.basics;

public class LinkedList {
    private int size;
    private  Node head;
    private  Node tail;

    public LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            size += 1;
            return;
        }
        newNode.next = head;
        head = newNode;

        size += 1;
        
    }

    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            size+=1;
            return ;
        }
        tail.next = newNode;
        tail=newNode;
        size+=1;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return ; 
        }
        //if index is greater than current size , insert at last
        if(index == size || index > size ){
            insertLast(val);
            return ; 
        }

        Node temp = head;
        for ( int i = 1 ; i < index ; i++){
            temp = temp.next ; 
        }
        Node newNode = new Node(7,temp.next);
        temp.next = newNode;
    }

    public void displayNodes() {
        Node temp = head ; 
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
