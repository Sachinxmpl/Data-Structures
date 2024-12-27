package dynamic_linear_structures.linkedList.problems;

public class rotate_linkedList {
    
}


//leetcode
//https://leetcode.com/problems/rotate-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k < 1 || head == null || head.next == null){
            return head; 
        }
        int length = getLength(head) ; 
        k = k % length ; 
        ListNode temp = head; 
        while(temp.next != null){
            temp = temp.next ; 
        }

        ListNode currTail = temp ; 
        currTail.next = head ; 

        ListNode pointer = head ; 
        int shift = length - k ; 

        while(shift > 1){
            shift -- ; 
            pointer = pointer.next ; 
        }

        head = pointer.next; 
        pointer.next = null ; 

        return head; 
    }
    
    int getLength(ListNode head){
        int length = 0 ; 
        ListNode temp = head; 
        while(temp != null){
            temp = temp.next;  
            length ++ ; 
        }
        return length ; 
    }
}