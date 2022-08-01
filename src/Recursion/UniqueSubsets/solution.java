package Recursion.UniqueSubsets;

import java.util.*;

public class solution {

    public static void uniqueSubsets(int idx, int nums[], ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<Integer>(list));
        for(int i=idx; i<nums.length; i++){
            if(idx != i && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            uniqueSubsets(i+1, nums, list, ans);
            list.remove(list.size()-1);
        }
    }
    
    public static ArrayList<ArrayList<Integer>> subsets(int nums[]){
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        uniqueSubsets(0,nums, new ArrayList<Integer>(), ans);
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {1,1,3};
        System.out.println(subsets(nums).toString());
    }
}
