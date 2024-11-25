package dynamic_linear_structures.linkedList.circularLinkedList;

public class main {
  public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertValue(77);
        ll.insertValue(90);
        ll.insertValue(120);
        ll.insertValue(3280);
        ll.displayNodes();
        System.out.println(ll.getSize());
        System.out.println(ll.getNodeIndex(120));
        System.out.println(ll.getNodeIndex(77));
        System.out.println(ll.getNodeIndex(90));
        

        System.out.println(ll.delete(77));
        ll.displayNodes();

        System.out.println(ll.delete(90));
        ll.displayNodes();
  } 
}
