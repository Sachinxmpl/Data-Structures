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
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode mid = getMid(head);
        ListNode secondHead = reverse(mid);

        while (secondHead != null) {
            if (secondHead.val != head.val) {
                return false;
            }
            secondHead = secondHead.next;
            head = head.next;
        }
        return true;
    }

    ListNode reverse(ListNode mid) {
        if (mid == null) {
            return mid;
        }
        ListNode prev = null;
        ListNode curr = mid;
        ListNode next = curr.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}