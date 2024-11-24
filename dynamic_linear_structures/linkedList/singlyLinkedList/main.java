package dynamic_linear_structures.linkedList.singlyLinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insertFirst(320);
        ls.insertFirst(230);
        ls.insertFirst(400);
        ls.insertFirst(9);
        ls.insertLast(40);
        ls.insert(100, 2);

        ls.displayNodes();

        System.out.println(ls.deleteFirst());
        ls.displayNodes();
        System.out.println(ls.deleteLast());
        ls.displayNodes();
        System.out.println(ls.getSize());

        System.out.println(ls.delete(1));
        ls.displayNodes();
    }
}
