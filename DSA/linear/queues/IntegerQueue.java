//package DSA.linear.queues;
//
//public class IntegerQueue {
//    private static final int MAXSIZE=5;
//    private int[] arr=new int[MAXSIZE];
//    private int rear;
//    private int front;
//    public IntegerQueue(){
//        front= rear = -1;
//    }
//    public boolean isEmpty(){
//        return rear==MAXSIZE-1;
//    }
//    public boolean isFull(){
//        return rear==MAXSIZE-1;
//    }
//    public void enqueue(int data){
//        if(isFull()){
//            System.out.println("cant add");
//            return;
//        }
//        if(isEmpty()){
//            front = rear= 0;
//        }else{
//            rear++;
//        }
//        arr[rear]=data;
//        System.out.println("data to the queue: "+ data);
//    }
//    public void dequeue(){
//        if
//    }
//
//}
