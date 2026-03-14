package DSA;

public class LinearSearch {
    static int LinearSearch(int [] arr, int target){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==target){
                return i;                    //If target is found, return the index.
            }
        }
        return -1;                          //If target is not found,return an invalid index.

    }

    public static void main(String[] args) {
        int[] arr={10,50,42,65};
        System.out.println(LinearSearch(arr,80));
        System.out.println(LinearSearch(arr,42));
    }
}
