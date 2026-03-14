package DSA.linear.linkedList.FloydsLinkedList;

class ListNode1 {
    int data;
    ListNode1 next;

    ListNode1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {

    static int findMiddle(ListNode1 head) {

        ListNode1 slow = head;
        ListNode1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        ListNode1 head1 = new ListNode1(1);
        head1.next = new ListNode1(2);
        head1.next.next = new ListNode1(3);
        head1.next.next.next = new ListNode1(4);
        head1.next.next.next.next = new ListNode1(5);
        head1.next.next.next.next.next = new ListNode1(6);
        head1.next.next.next.next.next.next = new ListNode1(7);
        head1.next.next.next.next.next.next.next = new ListNode1(8);

        System.out.println(findMiddle(head1));
    }
}