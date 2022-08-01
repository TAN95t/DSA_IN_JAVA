package Recursion.CombinationSumTwo;

import java.util.*;


public class solution {

    public static void subSum(int idx, int nums[], ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans, int k){
        if(k==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx; i<nums.length; i++){
            if(i> idx && nums[i]==nums[i-1]) continue;
            if(nums[i]>k) break;
            list.add(nums[i]);
            subSum(i+1, nums, list, ans, k-nums[i]);
            list.remove(list.size()-1);
        }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(int nums[], int k){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subSum(0, nums, new ArrayList<Integer>(), ans, k);
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,1};
        System.out.println(combinationSum(nums, 5).toString());
    }
}
