package dynamic_linear_structures.linkedList.problems;

public class Remove_nth_node_from_end_of_list{

}

//leetcide problem 19 
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 1){
            return head ; 
        }

        int length = getLength(head) ; 
        ListNode previousNode = getNode(head , length - n) ; 
        ListNode current = getNode(head , length - n + 1); 
        if(previousNode != null){
            previousNode.next = current.next ; 
        }else {
            head = current.next ; 
        }

        return head  ; 
        
    }

    int getLength(ListNode head ){
        ListNode temp = head ; 
        int length = 0 ; 
        while(temp != null){
            length ++ ; 
            temp = temp.next ; 
        }
        return length ; 
    }

    ListNode getNode(ListNode head  ,int n){
        if(head == null || n <= 0){
            return null ; 
        }
        ListNode temp = head ; 
        while(n > 1 && temp != null ){
            temp = temp.next ; 
            n-- ; 
        }
        return temp ; 
    }
}