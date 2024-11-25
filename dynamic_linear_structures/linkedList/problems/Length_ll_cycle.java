package dynamic_linear_structures.linkedList.problems;

public class Length_ll_cycle {
    
}


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


//  Input: head: 25 -> 14 -> 19 -> 33 -> 10 -> 21 -> 39 ->90 ->58 -> 45 -> 33
// Output: 7
// Explanation: The loop is present in the below-linked list and the length of the loop is 7. 


class Solution {
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head; 
        ListNode slow = head; 
        int length = 0 ;

        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow.next  ;
                length +=1 ; 
                while(temp != fast){
                    length ++;
                    temp = temp.next;
                }
                return length ; 
            }
        }

        return length ;


    }
}

