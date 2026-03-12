package DSA.linear.linkedList;

class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }
    public class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;  //We don't have the address of the next node.
            size++;
        }
    }
    public void printList(){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        //Create a new node
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data) {
        //Create a new node
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node last= head;
        while(last.next!=null){
            //If there are multiple nodes, we need to find the last node.
            last = last.next;
        }
        //At th ened of this loop , we will stand at the last node.
        last.next=newNode;
    }
    public void removeFirst(){
        //Empty list -> cannot remove the head node.
        if(head== null){
            System.out.println("List is empty.");
            return;
        }
        //For a single , the haed will point to the next(null)
        //For a multiple nodes, the head will point to the next(head.next)
        head =this.head.next;
        size--;
    }
    public void removeLast() {
        //Empty list -> cannot remove the tail node.
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        //single Element in the list
        if (head.next == null) {
            head = null;
            // C/C++ style of code.

            return;
        }
        //Multiple ELemnt in the list.
        Node curr= head;
        Node last = head.next;
        while(last.next!=null){
            curr= last;
            last= last.next;
        }
        //The last node will be cleared by the jvm if not used.
        //So if we point the second last (curr) node to null pointer.
        curr.next= null;
        size--;
    }
    public void removeTarget(String Target){
        //Empty list -> cannot remove the tail node.
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        //Case : target is the next node itself
        if(head.data.equals(Target)){
            head = head.next;
            size--;
            return;
        }

        Node prev= null;
        Node curr= head;
        while (curr!=null && ! curr.data.equals(Target)){
            prev= curr;
            curr= curr.next;
        }
        //do a check to see if curr pointer is null.
        // if its null , the target is not found.
        if(curr!=null){
            prev.next= curr.next;
            size--;
        }
    }
    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("We");
       sll.printList();
       // System.out.println();
       sll.addLast("in");
       sll.addLast("Java");
       sll.addLast("at");
       sll.addLast("Snpsu");
       sll.printList();
       sll.removeFirst();
       sll.printList();
       sll.removeLast();
       sll.printList();
       sll.removeTarget("in");
       sll.printList();
    }
}


