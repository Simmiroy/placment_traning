package DSA.nonLinearHeaps;

import java.util.PriorityQueue;
import java.util.*;
public class KthSmallest {
    static void findKSmallest(int[]arr,int k){
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        //Insert all elements into the heap
        //Remove the elements exceeding the k sizes
        for(int num: arr){
            maxHeap.add(num);
            if(maxHeap.size()>k){
                maxHeap.poll(); //Remove smallest if size>k
            }
        }
        //After the operation , the top element will be the kth smallest
        System.out.println("The kth smallest in the array: "+ Arrays.toString(arr)+" is "+maxHeap.peek());
        //Print all the k-largest elements one by one
        while(!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={4,9, 2 , 1,3 ,0};
        int k=3;
        findKSmallest(arr,k);

    }
}
