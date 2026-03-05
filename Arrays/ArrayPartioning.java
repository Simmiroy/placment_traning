package Arrays;

public class ArrayPartioning {
    public static void main(String[] args) {
        int arr[]={4,7,9,2,8,1};
        int left=0;
        int right= arr.length-1;
        while (left<right){
            while (arr[left]%2==0){
                left++;                    //If the right side has even numbers , move forward.
            }
            while (arr[right]%2==1){
                right--;                  //If the right side has even numbers , move forward.
            }
            if(left<right){               //If the numbers & sides dont macth, swap.
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        for(int x:arr){
            System.out.print(x +" ");
        }
    }
}
