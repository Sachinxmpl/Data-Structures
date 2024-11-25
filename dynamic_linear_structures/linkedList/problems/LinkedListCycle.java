package dynamic_linear_structures.linkedList.problems;

public class LinkedListCycle {
}

//Fast and Slow pointer method 
//1 Cycle detection 
//2 finding a node in cycle etc

//leetcode problem https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head; 
        ListNode slow = head; 

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true; 
            }
        }

        return false ;
    }
}
