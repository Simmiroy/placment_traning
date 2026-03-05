package Arrays;

public class MissingNumber {
    public static int MissingNumber(int[] arr) {
        int n= arr.length+1;
        int totalSum=(n * (n+1))/2;
        int arrSum=0;
        for(int i=0; i<arr.length; i++){
            arrSum=arrSum+arr[i];
        }
        return totalSum-arrSum;

    }

    public static void main(String[] args) {
        int[]arr={1,2,4,5};
        System.out.println("Missing Number : "+MissingNumber(arr));
    }
}
