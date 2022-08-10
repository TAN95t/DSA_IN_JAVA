package Recursion.PartetionInKSubsets;

import java.util.*;

public class solution {

    public static void findSubsets(int i, int n, int k, int nos, ArrayList<ArrayList<Integer>> ans){

        if(i > n){
            if(nos == k){
                System.out.println(ans.toString());
            }
            return;
        }


        for(int j=0; j<ans.size(); j++){
            if(ans.get(j).size() > 0){
                ans.get(j).add(i);
                findSubsets(i+1, n, k, nos, ans);
                ans.get(j).remove(ans.get(j).size() - 1);
            }
            else{
                ans.get(j).add(i);
                findSubsets(i+1, n, k, nos + 1, ans);
                ans.get(j).remove(ans.get(j).size() - 1);
                break;
            }
        }
    }

    public static void main(String[] args){
        int n = 4;
        int k = 3;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<k; i++){
            ans.add(new ArrayList<>());
        }

        findSubsets(1,n,k,0,ans);
    }
    
}
