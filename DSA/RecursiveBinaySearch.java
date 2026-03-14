package DSA;

public class RecursiveBinaySearch {
    public static int recursiveBinaySearch(int[]  arr ,int key,int s,int e) {
        if(s>e) return -1;
        int mid=s +(e-s)/2;
        if(arr[mid]==key) return mid;

        if(arr[mid]<key){
            return recursiveBinaySearch(arr,key,mid+1,e);
        }
        else
            return recursiveBinaySearch(arr,key,s,mid-1);
    }

    public static void main(String[] args) {
        int [] arr={2,5,8,12,16,23,38,45};
        int key=38;
        int result=recursiveBinaySearch(arr,key,0, arr.length-1);
        System.out.println("Element found at index: " + result);
    }
}
