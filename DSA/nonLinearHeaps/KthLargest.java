package DSA.nonLinearHeaps;

import java.util.PriorityQueue;

public class KthLargest {
    static void findKLargestAndKthLargestElements(int[] arr, int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        //Insert all elements into the heap
        //Remove the elements exceeding the k sizes
        for(int num: arr){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll(); //Remove smallest if size>k
            }
        }
        //Print the kth largest
        System.out.println("The kth largest is: "+minHeap.peek());
        //Print all the k-largest elements one by one
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={19, 21, 4 ,9, 8 , 3 ,7};
        int k=3;
        findKLargestAndKthLargestElements(arr,k);
    }
}
