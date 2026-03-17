package assignment4;
import java.util.*;
public class Leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];

        for(int i = 0; i < nums.length; i++) {
            while(!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.offer(i);

            if(i >= k - 1)
                res[i - k + 1] = nums[dq.peek()];
        }
        return res;
    }
}
