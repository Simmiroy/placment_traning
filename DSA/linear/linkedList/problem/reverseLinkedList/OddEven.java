package DSA.linear.linkedList.problem.reverseLinkedList;
import java.util.Scanner;
class node {
int data;
node next;
node(int data){
this.data= data;
}
}
public class OddEven {
    static node head=null;
    static void insert(int data){
        node newNode = new node(data);
        if(head== null){
            head = newNode;
            return;
        }
        node curr =head;
        while(curr.next!= null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    static void printEven(){
        node curr = head;
        while(curr!=null){
            if(curr.data %2==0){
                System.out.print(curr.data + " ");
            }
            curr= curr.next;
        }
    }
    static void printOdd(){
        node curr = head;
        while (curr!=null){
            if(curr.data %2!=0){
                System.out.print(curr.data +" ");
            }
            curr=curr.next;
        }
    }
    static void display(){
        node curr = head;
        while(curr!=null ){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            insert(sc.nextInt());
        }
        display();
        System.out.println();
        printEven();
        System.out.println();
        printOdd();
    }
}
