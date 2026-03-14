package assignment3;

public class DifferenceArray {

    public static void update(int[] diff, int l, int r, int val){
        diff[l] += val;
        if(r + 1 < diff.length)
            diff[r+1] -= val;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {0,0,0,0,0};
        int[] diff = new int[n];

        update(diff,1,3,5);

        arr[0] = diff[0];

        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + diff[i];
        }

        for(int x : arr)
            System.out.print(x + " ");
    }
}
