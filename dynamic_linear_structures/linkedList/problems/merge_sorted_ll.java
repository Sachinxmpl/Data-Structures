package dynamic_linear_structures.linkedList.problems;

public class merge_sorted_ll {
    
}

//https://leetcode.com/problems/merge-two-sorted-lists/submissions/1462535516/


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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead; 
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1 ; 
                tail = list1 ; 
                list1 = list1.next ; 
            }else {
                tail.next = list2 ; 
                tail = list2 ; 
                list2 = list2.next;  
            }
        }

        tail.next = (list1 != null)? list1 : list2 ; 

        return dummyHead.next;
    }
}