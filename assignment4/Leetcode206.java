package assignment4;
import DSA.linear.linkedList.problem.reverseLinkedList.ListNode;

import java.util.*;
public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev;          // reverse link
            prev = curr;
            curr = next;
        }

        return prev; // new head
    }
}