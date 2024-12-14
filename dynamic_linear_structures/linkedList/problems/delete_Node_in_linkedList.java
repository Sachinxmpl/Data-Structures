package dynamic_linear_structures.linkedList.problems;

public class delete_Node_in_linkedList {
    
}

//leetcode 237
//https://leetcode.com/problems/delete-node-in-a-linked-list/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       node.val = node.next.val ; 
       node.next = node.next.next ; 
    }
}