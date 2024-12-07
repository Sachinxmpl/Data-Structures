package dynamic_linear_structures.linkedList.problems;

import java.util.* ; 

public class palindrome_linkedList {
    
}













//!Solution 1 Not optimized as it takes O(n) time and O(n) space 
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true ; 
        }

        List<Integer> list = new ArrayList<>();
        ListNode temp = head ; 
        while(temp != null){
            list.add(temp.val) ; 
            temp = temp.next; 
        }

        int left = 0 ; 
        int right = list.size() - 1; 

        while(left <= right){
            if(list.get(left) != list.get(right)){
                return false ; 
            }
            left ++ ; 
            right -- ; 
        }

        return true  ; 
    }
}









//! Better solution as timeComplexity O(n) space O(1)

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
class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true ; 
        }
        ListNode mid = getMid(head);
        ListNode headSecond = reverseList(mid)  ; 
        ListNode storeHeadSecond = headSecond ;


        //compare 
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next ; 
            headSecond = headSecond.next ; 
        } 

        reverseList(storeHeadSecond);
        if(head == null || headSecond == null){
            return true ; 
        }
        return false  ; 

    


    }

    ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head ;
        }
        ListNode previous = null ; 
        ListNode current = head ;
        ListNode next = current.next ; 
        while(current != null){
            current.next = previous  ; 
            previous = current ; 
            current = next ; 
            if(next != null){
                next = next.next ; 
            }
        }

        return previous ; 
    }

    ListNode getMid(ListNode head){
        ListNode fast = head; 
        ListNode slow = head ; 

        while(fast != null && fast.next != null){
            fast = fast.next.next ; 
            slow = slow.next ; 
        }

        return slow ; 
    }
}