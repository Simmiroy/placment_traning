package DSA.linear.linkedList.FloydsLinkedList;
class ListNode2 {
    int data;
    ListNode2 next;

    ListNode2(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CycleDetection {
    static ListNode2 head= null;
    static  void  createList(){
        head = new ListNode2(10);
        head.next = new ListNode2(20);
        head.next.next = new ListNode2(30);
        head.next.next.next= new ListNode2(40);
        head.next.next.next.next= head.next;
    }
    static boolean hasCycle(){
        ListNode2 slow = head;
        ListNode2 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow== fast){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        createList();
        if(hasCycle()){
            System.out.println("Detected");
        }else{
            System.out.println("No cycle");
        }
    }

}
