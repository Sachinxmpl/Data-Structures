package linear_structures.stacksAndQueues.part2;

public class StackUsingLinkedlist {
    public static class Stack {
        LinkedList ls = new LinkedList();

        boolean isEmpty() {
            return ls.size() == 0;
        }

        public void push(int val) {
            ls.insertLast(val);
        }

        public int pop() {
            return ls.deleteLast();
        }

        public void display() {
            ls.displayNode();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(32);
        stack.push(44);
        stack.push(48);
        stack.push(34);
        stack.display();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

class LinkedList {
    Node head = null;
    Node top = null;
    int size;

    LinkedList() {
        this.size = 0;
    }

    int size() {
        return size;
    }

    void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            top = newNode;
            size++;
            return;
        }
        top.next = newNode;
        size++;
        top = newNode;
    }

    int deleteLast() {
        if (size == 0) {
            return -1;
        }
        int tobedeleted = top.value;
        if (size == 1) {
            head = null;
            top = null;
        } else {
            Node temp = head;
            while (temp.next != top) {
                temp = temp.next;
            }
            temp.next = null;
            top = temp;
        }
        size--;
        return tobedeleted;
    }

    void displayNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "~>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        Node(int value, Node other) {
            this.value = value;
            this.next = other;
        }
    }
}