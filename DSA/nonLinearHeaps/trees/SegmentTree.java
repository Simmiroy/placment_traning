package DSA.nonLinearHeaps.trees;

import java.util.Scanner;

public class SegmentTree {
    private static final int MAX_SIZE=10005; //MAximum size of the
    private static int[] a=new int[MAX_SIZE]; //input Array
    private static int[] seg= new int[4*MAX_SIZE]; //Segment tree
    //Function to build the segment tee
    private static void build(int ind , int low, int high){
        if(low==high){
            seg[ind]=a[low]; //Leaf node will have a single element
            return;
        }
        int mid =(low +high)/2;
        build(2*ind+1,low,mid);//Build left child
        build(2*ind+2,mid+1,high); //Build right child
        seg[ind]=Math.max(seg[2*ind+1],seg[2*ind+2]);
    }
    //Function to query in a given range(l,r)
    private static int query(int ind, int low, int high, int l , int r){
        if(low>=1 && high<=r){
            return seg[ind];
        }
        if(high<l || low>r){ // low, high[0,2] l,r[3,8]
            //NO Overlap
            return Integer.MIN_VALUE; //Return Minimum possible balue
        }
        int mid = (low+high)/2; //Partial Overlap
        int left = query(2*ind+1 ,low, mid, l,r);
        int right = query(2*ind+2 ,low, mid+1, l,r);
        return Math.max(left,right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt(); //Size of the input array
        System.out.println("Enter the elemnts: ");
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        build(0,0,n-1);
        System.out.println("Enter the number of the queries: ");
        int q= sc.nextInt();
        while(q-->0){
            System.out.println("Enter the range[l,r]: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int result = query(0, 0 ,n-1, l,r);
            System.out.println(
                    "Maximum in range[" + ","+ r +"] is: " +result);
        }
    }
}
