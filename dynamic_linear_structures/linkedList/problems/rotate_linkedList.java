package dynamic_linear_structures.linkedList.problems;

public class rotate_linkedList {
    
}


//leetcode
//https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0){
            return head ; 
        }


        ListNode temp = head ; 
        int length = 0; 
        while(temp != null){
            length ++  ; 
            temp = temp.next; 
        }



        k = k % length ; 
        if(k == 0){
            return head ; 
        }


        ListNode tail = head ; 
        int x = length; 
        while(x > 1){
            tail = tail.next ; 
            x-- ; 
        }
        tail.next = head ; 

        int steps = length - k ; 

        ListNode newtail = head ; 
        for ( int i = 1 ; i < steps ; i++){
            newtail = newtail.next ; 
        }

        ListNode newHead = newtail.next ; 

        newtail.next = null ; 

        return newHead ; 

        
    }
}