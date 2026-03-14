package assignment3;
public class BinarySearchRecursive {

    public static int search(int[] arr,int left,int right,int target){

        if(left > right)
            return -1;

        int mid = (left + right)/2;

        if(arr[mid] == target)
            return mid;

        if(arr[mid] < target)
            return search(arr,mid+1,right,target);

        return search(arr,left,mid-1,target);
    }
}
