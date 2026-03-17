package assignment4;

import DSA.linear.linkedList.problem.reverseLinkedList.ListNode;
public class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // cycle found
            }
        }

        return false; // no cycle
    }
}