package assignment4;

public class SingleNumberUsingXOR {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n : nums) res ^= n;
        return res;
    }
}
