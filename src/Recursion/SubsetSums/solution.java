package Recursion.SubsetSums;

import java.util.*;

public class solution {

    public static void subsets(int sum, int idx, int nums[], ArrayList<Integer> ans){
        if(idx == nums.length){
            ans.add(sum);
            return;
        }

        subsets(sum, idx+1, nums, ans);
        subsets(sum+nums[idx], idx+1, nums, ans);
    }
    
    public static ArrayList<Integer> subsetSum(int nums[]){

        ArrayList<Integer> ans = new ArrayList<>();
        subsets(0,0, nums, ans);
        Collections.sort(ans);
        return ans;
        
    }

    public static void main(String[] args){
        int nums[] = {1,2};
        System.out.println(subsetSum(nums).toString());
    }
    
}
