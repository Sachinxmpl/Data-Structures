package dynamic_linear_structures.linkedList.problems;

public class LL_cycle_2 {
    
}

//https://leetcode.com/problems/linked-list-cycle-ii/

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
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // Find cycle length
                int length = findCycleLength(slow);

                // Find the start of the cycle
                return findStart(head, length);
            }
        }

        return null; // No cycle
    }

    // Helper method to find cycle length
    private int findCycleLength(ListNode node) {
        int length = 1;
        ListNode current = node.next;

        while (current != node) {
            current = current.next;
            length++;
        }

        return length;
    }

    // Helper method to find the start of the cycle
    private ListNode findStart(ListNode head, int length) {
        ListNode x = head;
        ListNode y = head;

        // Move y ahead by 'length' steps
        while (length > 0) {
            y = y.next;
            length--;
        }

        // Move both pointers until they meet
        while (x != y) {
            x = x.next;
            y = y.next;
        }

        return x; // Start of the cycle
    }
}
