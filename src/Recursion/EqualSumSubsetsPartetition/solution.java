package Recursion.EqualSumSubsetsPartetition;

import java.util.*;

public class solution {

    public static void findSubsets(int [] arr, int idx, int n, int k, int [] subsetSum, int nos, ArrayList<ArrayList<Integer>> ans){

        if(idx == arr.length){
            if(nos == k){
                boolean flag = true;
                for(int i=0; i<subsetSum.length -1; i++){
                    if(subsetSum[i] != subsetSum[i+1]){
                        flag = !flag;
                        break;
                    }
                }
                if(flag){
                    System.out.println(ans.toString());
                }
            }
            return;
        }

        for(int i=0; i<ans.size(); i++){
            if(ans.get(i).size()>0){
                ans.get(i).add(arr[idx]);
                subsetSum[i] += arr[idx];
                findSubsets(arr, idx+1, n, k, subsetSum, nos, ans);
                subsetSum[i] -= arr[idx];
                ans.get(i).remove(ans.get(i).size()-1);
            }
            else{
                ans.get(i).add(arr[idx]);
                subsetSum[i] += arr[idx];
                findSubsets(arr, idx+1, n, k, subsetSum, nos+1, ans);
                subsetSum[i] -= arr[idx];
                ans.get(i).remove(ans.get(i).size()-1);
                break;
            }
        }
    }
    
    public static void main (String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int subsetSum[] = new int[k];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<k; i++){
            ans.add(new ArrayList<>());
        }

        findSubsets(arr, 0, arr.length, k, subsetSum, 0, ans);


    }   
}
