package dynamic_linear_structures.linkedList.problems;

public class reverse_DoublyLinkedList {
    
}
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        if (head == null) {
            return null;
        }
        
        DLLNode temp = head;
        DLLNode newHead = null;
        
        while (temp != null) {
            DLLNode x = temp.next;
            temp.next = temp.prev;
            temp.prev = x;
            
            newHead = temp;
            temp = x;
        }
        
        return newHead;
    }
}