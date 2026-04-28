package DSA.graphs.algos.dynamicProgramming;

public class FibonaccciTabulation {
    //In the tabulation code , we create the dp array inside the helper function
    public static int fib(int n){
        if(n<=1) {
            return n;
        }
            //Step 1: Create an array of n+1 size (0-based indexing)
            //Step-2: Create the known values
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            //Take a for loop from 2 till n
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    public static void main(String[] args) {
        int n =6;
        System.out.println("Fibonacci at index "+ n + " is: "+fib(n));
    }
}
