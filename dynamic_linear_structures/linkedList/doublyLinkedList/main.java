package dynamic_linear_structures.linkedList.doublyLinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertFirst(80);
        ll.displayNode();
        ll.displayReverse();

        System.out.println();
        System.out.println(ll.getSize());

        ll.insertLast(9);
        ll.insertLast(99);
        ll.displayNode();
    }
}
