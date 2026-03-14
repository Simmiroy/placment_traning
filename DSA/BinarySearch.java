package DSA;

public class BinarySearch {
    static int main(int[] arr, int key){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={10,50,42,65,80};
        System.out.println(main(arr,100));
        }
}
