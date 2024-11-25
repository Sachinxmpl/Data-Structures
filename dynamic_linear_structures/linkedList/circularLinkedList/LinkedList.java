package dynamic_linear_structures.linkedList.circularLinkedList;

public class LinkedList {
    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void insertValue(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            head.next = null;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
    }

    public void displayNodes() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != tail) {
            System.out.print(temp.value + "~>");
            temp = temp.next;
        }
        System.out.println(tail.value + "~>" + tail.next.value);
    }

    public int delete(int value) {
        if(head == null){
            return -1 ; 
        }
        int index = getNodeIndex(value);
        Node justBefore = getNode(index-1);
        Node curr = getNode(index);
        int tobedeleted = curr.value;
        
        if(index == 0){
            head = head.next ; 
            tail.next = head;
            return tobedeleted;
        }

        justBefore.next = curr.next;
        
        return tobedeleted;
       
    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getNodeIndex(int value) {
        if (head == null) { // Handle empty list
            return -1;
        }

        Node temp = head;
        int index = 0;

        // Traverse the circular linked list
        do {
            if (temp.value == value) { // Check if current node contains the value
                return index;
            }
            temp = temp.next; // Move to the next node
            index++;
        } while (temp != head); // Stop when we circle back to the head

        // Value not found
        return -1;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node otherNode) {
            this.value = value;
            this.next = otherNode;
        }

    }
}
