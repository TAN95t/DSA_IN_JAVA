package Recursion.SubsetsOfArrayWithSumK;

import java.util.*;

public class solution {

    public static void subSum(int idx, int k,int nums[], ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans){
        if(idx == nums.length){
            if(k==0){
                ans.add(new ArrayList<>(list));
                return;
            }
            return;
        }

        if(nums[idx]<=k){
            list.add(nums[idx]);
            subSum(idx, k-nums[idx], nums, list, ans);
            list.remove(list.size()-1);
        }
        subSum(idx+1,k,nums,list, ans);
    }

    public static void uniqueSubsetSum(int idx, int k, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans, int nums[]){
        if(idx == nums.length){
            if(k==0){
                ans.add(new ArrayList<>(list));
                return;
            }
            return;
        }

        uniqueSubsetSum(idx+1, k, list, ans, nums);
        // ArrayList<Integer> list1 = new ArrayList<>(list);
        // list1.add(nums[idx]);
        list.add(nums[idx]);
        uniqueSubsetSum(idx+1, k-nums[idx], list, ans, nums);
        list.remove(list.size()-1);
    }

    public static ArrayList<ArrayList<Integer>> subsetsWithSumK(int nums[], int k){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // subSum(0,k,nums,new ArrayList<Integer>(), ans);
        uniqueSubsetSum(0, k, new ArrayList<Integer>(), ans, nums);
        return ans;
    }

    public static void main(String[] args){
        int nums[] = {2,4,6};
        System.out.println(subsetsWithSumK(nums, 6).toString());
    }    
}
