package DSA.linear.linkedList.problem.reverseLinkedList;

import java.util.Stack;

public class PalindromeLinkedList {
        public static boolean isPalindrme(ListNode head){
                Stack<Integer> stack = new Stack<>();
                ListNode temp = head;
                //Traverse the list first time to push the elemnts into the stack.
                while (temp!=null){
                        stack.push(temp.data);
                        temp= temp.next;
                }
                temp= head;
                //Now compare the nodes with the stack top elements.
                while(temp!=null){
                        if(temp.data != stack.pop()){
                                return false;
                        }
                        temp = temp.next;
                }
                return true;
        }

        public static void main(String[] args) {
                ListNode head1= new ListNode(1);
                head1.next = new ListNode(2);
                head1.next.next = new ListNode(1);
                System.out.println(isPalindrme(head1)? "Palindrome" : " Not Palindrome");
                ListNode head2= new ListNode(1);
                head1.next = new ListNode(2);
                head1.next.next = new ListNode(3);
                System.out.println(isPalindrme(head1)? "Palindrome" : "Not Palindrome");
        }
}
