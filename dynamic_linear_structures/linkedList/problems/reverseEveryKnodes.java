package dynamic_linear_structures.linkedList.problems;

public class reverseEveryKnodes {
    
}

//???????? ! lEetcode hard 

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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null || head.next == null){
            return head;
        }
        ListNode prev = null ; 
        ListNode curr = head; 

        int length = getLength(head) ; 
        int count = length/k ; 
        while(count > 0){
            ListNode last = prev ; 
            ListNode newEnd = curr ; 

            for(int i = 0 ; i < k && curr != null ; i++){
                ListNode fut  = curr.next; 
                curr.next = prev;
                prev = curr; 
                curr = fut ; 
            }

            if(last != null){
                last.next = prev; 
            }else{
                head = prev ; 
            }
            newEnd.next = curr;
            prev = newEnd ; 
            count -- ; 
        }

        return head ;
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