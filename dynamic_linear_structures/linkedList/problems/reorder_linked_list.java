package dynamic_linear_structures.linkedList.problems;

public class reorder_linked_list {
    
}

//Leetcode problem 
//https://leetcode.com/problems/reorder-list/

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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return ; 
        }
        ListNode mid = getMid(head) ; 
        ListNode secondHead = reverseList(mid) ; 

        ListNode firstHead = head; 
        while(firstHead != null && secondHead != null){
            ListNode temp = firstHead.next ; 
            firstHead.next = secondHead ; 
            firstHead = temp ; 

            temp = secondHead.next ; 
            secondHead.next = firstHead ; 
            secondHead = temp ;  
        }
        
        //next of tail to null 
        if(firstHead != null){
            firstHead.next = null  ; 
        }
    }

    ListNode reverseList(ListNode head){
        ListNode previous = null ; 
        ListNode current = head ; 
        ListNode next = current.next ; 
        while(current != null){
            current.next = previous ; 
            previous = current ; 
            current = next ; 
            if(next != null){
                next = next.next ; 
            }
        }
        return previous ;
    }

    ListNode getMid(ListNode head){
        ListNode slow = head; 
        ListNode fast = head; 
        while(fast != null && fast.next != null){
            fast = fast.next.next ; 
            slow = slow.next ; 
        }
        return slow ; 
    }
}