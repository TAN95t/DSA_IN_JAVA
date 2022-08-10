package Recursion.PalindromePartitioning;

import java.util.*;

public class solution {

    public static boolean isPalindrome(String str, int start, int end){
        while(start < end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void find(String str, int idx, ArrayList<String> list, ArrayList<ArrayList<String>> ans){
        if(idx == str.length()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<str.length(); i++ ){
            if(isPalindrome(str, idx, i)){
                list.add(str.substring(idx, i+1));
                find(str, i+1, list, ans);
                list.remove(list.size()-1);
            }
        }
    }
    

    public static ArrayList<ArrayList<String>> partitions(String str){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        find(str, 0, new ArrayList<String>(), ans);
        return ans;
    }

    public static void main(String[] args){
        String str = "abaaba";
        System.out.println(partitions(str).toString());
    }
}
