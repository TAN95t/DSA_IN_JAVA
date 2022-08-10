package Backtracking.PalindromePartetioninig;

import java.util.*;

public class solution {

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void partition(String str,ArrayList<String> list, ArrayList<ArrayList<String>> ans){

        if(str.length() == 0){
            ans.add(new ArrayList<String>(list));
            return;
        }

        for(int i=0; i<str.length(); i++){
            String prefix = str.substring(0, i+1);
            String remaining = str.substring(i+1);
            if(isPalindrome(prefix)){
                list.add(prefix);
                partition(remaining, list, ans);
                list.remove(prefix);
            }
        }
    }

    public static void main (String[] args){
        String str = "pep";
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        partition(str, new ArrayList<String>(), ans);
        System.out.println(ans.toString());
    }
    
}
