package assignment4;
import java.util.*;
public class CombinationsSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> temp, int[] arr, int target, int start) {
        if(target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < arr.length; i++) {
            if(arr[i] > target) continue;
            temp.add(arr[i]);
            backtrack(res, temp, arr, target - arr[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}
