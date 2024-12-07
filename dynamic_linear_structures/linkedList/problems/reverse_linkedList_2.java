package dynamic_linear_structures.linkedList.problems;

public class reverse_linkedList_2 {
    
}
//leetcode problem
//https://leetcode.com/problems/reverse-linked-list-ii/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head ; 
        }
        if(head == null || head.next == null){
            return head ;
        }

        //skip first left -1 nodes 
        ListNode current = head ; 
        ListNode previous = null ; 
        for ( int i = 0 ; current != null && i < left - 1 ; i++){
            previous = current ; 
            current = current.next ; 
        }

        ListNode last = previous ; 
        ListNode newEnd = current ; 

        //reverse between left and right 
        ListNode next = current.next ; 
        for ( int i = 0 ; current!= null && i < right-left + 1 ; i++){
            current.next = previous ; 
            previous = current ; 
            current = next ; 
            if(next != null){
                next = next.next ; 
            }
        }
        if(last!= null){
            last.next = previous ; 
        }else{
            head = previous ; 
        }

        newEnd.next = current ; 

        return head ;
    }
}