package Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }

        for (int x : sum) {
            System.out.print(x + " ");
        }
    }
}
