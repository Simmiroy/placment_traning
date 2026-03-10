package assignment3;

import java.util.*;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {2,4,3,5,7,8};
        int target = 7;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            int complement = target - num;

            if(set.contains(complement)){
                System.out.println(complement + " " + num);
            }

            set.add(num);
        }
    }
}