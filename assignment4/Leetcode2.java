package assignment4;
import DSA.linear.linkedList.problem.reverseLinkedList.ListNode;

import java.util.*;
public class Leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if(l1 != null) sum += l1.val;
            if(l2 != null) sum += l2.val;

            curr.next = new ListNode(sum % 10);
            carry = sum / 10;

            curr = curr.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}
