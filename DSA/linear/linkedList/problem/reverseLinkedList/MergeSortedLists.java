package DSA.linear.linkedList.problem.reverseLinkedList;
//class ListNode3 {
//    int data;
//    ListNode3 next;
//
//    ListNode3(int data) {
//        this.data = data;
//
//    }
//}
//public class MergeSortedList {
//    static  ListNode3 mergeSortedList(ListNode3 l1, ListNode3 l2){
//        ListNode3 dummy = new ListNode3(0);
//        ListNode3 tail= dummy;
//        while(l1 != null && l2!= null){
//            if(l1.data<l2.data){
//                tail.next= l1;
//                l1= l1.next;
//            }else {
//                tail.next=l2;
//                l2= l2.next;
//            }
//            tail= tail.next;
//        }
//        //Attach remaining nodes by just copy & paste.
//        if(l1!=null){
//            tail.next=l1;
//        }else {
//            tail.next= l2;
//        }
//        return dummy.next;  // Because dummy is pointing to 0.
//    }
//    static void printList(ListNode3 head){
//        while(head!= null){
//            System.out.print(head.data + "->");
//            head= head.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//        ListNode3  l1= new ListNode3(1);
//        l1.next=new ListNode3(3);
//        l1.next.next= new ListNode3(5);
//        l1.next.next.next=new ListNode3(2);
//        ListNode3  l2= new ListNode3(4);
//        l2.next=new ListNode3(6);
//        l2.next.next= new ListNode3(6);
//        l2.next.next.next=new ListNode3(8);
//
//        ListNode3 merged=mergeSortedList(l1,l2);
//        printList(merged);
//    }
//
//}

class Nodee{
    int data;
    Nodee next;
    Nodee (int data){
        this.data = data;
    }
}
public class MergeSortedLists {
    static Nodee mergeSortedLists(Nodee l1, Nodee l2){
        Nodee dummy = new Nodee(0);
        Nodee tail = dummy;
        while (l1 != null && l2 != null){
            if(l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            }else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        //Attach remaining node by just copy and paste
        if(l1 != null){
            tail.next = l1;
        }else {
            tail.next = l2;
        }
        return dummy.next; // Because dummy is pointing to 0
    }
    static void printList(Nodee head){
        while (head != null){
            System.out.println(head.data  +  " -> "  );
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Nodee l1 = new Nodee(1);
        l1.next = new Nodee(3);
        l1.next.next = new Nodee(5);

        Nodee l2 = new Nodee(2);
        l2.next = new Nodee(4);
        l2.next.next = new Nodee(6);
        Nodee merged = mergeSortedLists(l1,l2);
        printList(merged);
    }
}
