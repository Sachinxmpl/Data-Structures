package dynamic_linear_structures.linkedList.problems;

public class oddEvenLinkedList {
    
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 //time O(n)
 //space O(1)
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        ListNode head1 = head; 
        ListNode head2 = head.next; 
        ListNode temp = head2; 

        while(head1.next != null && head2.next != null){
            ListNode temp1 = head1.next ; 
            head1.next = temp1.next; 
            head1 = temp1.next ; 

            ListNode temp2 = head2.next; 
            head2.next = temp2.next ; 
            head2 = temp2.next ; 
        }
        head1.next = temp ; 
        if(head2 != null){
            head2.next = null ; 
        }
        return head ;

    }
}


class Solution2 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        
        ListNode odd = head; 
        ListNode even = head.next ; 
        ListNode temp = even ; 
        
        while(even != null && even.next != null){
            odd.next = even.next ; 
            odd = odd.next ; 

            even.next = odd.next ;
            even = even.next; 
        }

        odd.next = temp ; 
        
        return head; 

    }
}