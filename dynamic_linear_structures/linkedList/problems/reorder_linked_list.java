package dynamic_linear_structures.linkedList.problems;

public class reorder_linked_list {

}

// Leetcode problem
// https://leetcode.com/problems/reorder-list/

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = getMid(head);
        ListNode secondHead = reverseList(mid.next);
        mid.next = null;

        ListNode firstHead = head;

        while (firstHead != null && secondHead != null) {
            ListNode temp1 = firstHead.next;
            ListNode temp2 = secondHead.next;

            firstHead.next = secondHead;
            secondHead.next = temp1;

            secondHead = temp2;
            firstHead = temp1;

        }

    }

    ListNode getMid(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
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
}