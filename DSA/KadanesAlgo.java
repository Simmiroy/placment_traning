package DSA;

public class KadanesAlgo {
     static int kadaneAlgo(int[] arr) {
         int cmax = arr[0];
         int gmax = arr[0];
         for (int i = 1; i < arr.length; i++) {
             cmax = Math.max(arr[i], cmax + arr[i]);
             gmax = Math.max(cmax, gmax);
         }
         return gmax;

     }

    public static void main(String[] args) {
         int[] arr={5,-8,1,2,-1,4};
        System.out.println(kadaneAlgo(arr));
        int []array={-1,-2,-3,-4,-5,0};
        System.out.println(kadaneAlgo(array));
    }
}
