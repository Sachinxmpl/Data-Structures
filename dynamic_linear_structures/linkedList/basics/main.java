package dynamic_linear_structures.linkedList.basics;

public class main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insertFirst(320);
        ls.insertFirst(230);
        ls.insertLast(40);
        ls.insert(100, 2);
        ls.displayNodes();
        System.out.println(ls.getSize());
    }
}
