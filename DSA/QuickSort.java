package DSA;
import java.util.Arrays;
public class QuickSort {
    public  static  void  swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partionIndex(int[] arr, int s, int e){
        int pivot = arr[s];
        int count=0;
        for(int i=s+1; i<=e; i++){
            if(arr[i]<pivot){
                count++;
            }
        }
        //Place the pivot at the correct index.
        int pivotIndex = s+count;
        swap(arr,pivotIndex, s);
        //Let manage the left & right side of the pivot
        int i=s, j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<pivot){               // If left side is smaller - move to t next.
                i++;
            }
            while(arr[j]>pivot){               // If right side is greater - move to t next.
                j--;
            }
            if(i<pivotIndex && j> pivotIndex){
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int[]  arr, int s, int e){
        //Base case // If single element or OutOFBounds
        if(s>=e){
            return;
        }
        //Find the pivot for the partion of the array
        int p= partionIndex(arr, s, e);
        //Now we use to sort the LHS & RHS
        //Left part
        quickSort(arr, s,p-1);
        //Right side
        quickSort(arr, p+1, e);

    }

    public static void main(String[] args) {
        int [] arr={8,4,7,3,10,2,6};
        int n=arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
}
