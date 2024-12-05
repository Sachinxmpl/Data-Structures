package dynamic_linear_structures.linkedList.problems;

public class inplaceReversal {
    
}

//leetcode problem 206 


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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }
        ListNode previous = null ; 
        ListNode current = head ; 
        ListNode future = current.next;

        while(current != null){
            current.next = previous ; 
            previous = current ; 
            current = future;
            if(future != null){
                future = future.next ; 
            }
        }

        return previous  ; 
    }
}