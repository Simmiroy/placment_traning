package DSA.backTrack;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void solve(int[] nums, List<Integer>output,int index,List<List<Integer>>ans){
        //Base case
        if(index>= nums.length){
            ans.add(new ArrayList<>(output));
            return ;
        }
        //Exclude case
        solve(nums,output,index+1,ans);
        //Include case
        output.add(nums[index]);
        solve(nums,output, index+1,ans);
        //Backtrack and remove the last element from
        output.remove(output.size()-1);          //this is important to understand this line.
    }

    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output= new ArrayList<>();
        int index=0;
        solve(nums,output,index,ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={1,2,3};
        List<List<Integer>> result=solution.subset(nums);
        for (List<Integer> subset:result){
            System.out.println(subset);
        }
    }
}
