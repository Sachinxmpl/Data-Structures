package dynamic_linear_structures.linkedList.singlyLinkedList;

public class LinkedList {
    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            size += 1;
            return;
        }
        newNode.next = head;
        head = newNode;

        size += 1;

    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            size += 1;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        // if index is greater than current size , insert at last
        if (index == size || index > size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public int deleteFirst() {
        int tobeDeleted = head.value; 
        head = head.next;

        //if head become null tail also must be null , case of 1 node 
        if(head == null){
            tail = null ; 
        }
        size --; 
        return tobeDeleted;
    }

    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        int tobeDeleted = tail.value;
        Node secondLast = get(size-2);
        tail = secondLast ; 
        tail.next = null ; 
        size-- ; 
        return tobeDeleted ; 
    }


    //complexity O(index) + O(index +1)== O(index) == O(N)
    public int delete(int index){
        if(index ==  0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node atIndex = get(index);
        int tobeDeleted = atIndex.value;
        Node beforeIndex = get(index-1);
        beforeIndex.next = atIndex.next;
        size--;
        return tobeDeleted; 
    }

    public Node get(int index){
        Node temp = head ; 
        for ( int i = 0 ; i < index ; i++){
            temp = temp.next ; 
        }
        return temp ; 
    }

    public Node find(int value){
        Node temp = head; 
        while(temp != null){
            if(temp.value == value){
                return temp ; 
            }
            temp = temp.next;
        }
        return temp ; 
    }

    public void displayNodes() {
        Node temp = head;
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
