package Strings.FindExtracharacter;

import java.util.*;

public class solution {
    

    public static void find(String a, String b){ 

        HashMap<Character, Integer> map = new HashMap<>();
        // ArrayList<Character> ans = new ArrayList<>();
        char ans = 'a';
        for(int i=0; i<a.length(); i++){
            char curr = a.charAt(i);
            if(!map.containsKey(curr)){
                map.put(curr, 1);
            }
            else{
                map.put(curr, map.get(curr) + 1);
            }
        }

        // for(Map.Entry<Character, Integer> it : map.entrySet()){
        //     System.out.println(it.getKey() + " "+ it.getValue());
        // }

        for(int i=0; i<b.length(); i++){
            char curr = b.charAt(i);
            if(!map.containsKey(curr)){
                map.put(curr, 1);
            }
            else{
                map.put(curr, map.get(curr)-1);
            }
        }

        for(Map.Entry<Character, Integer> it : map.entrySet()){
            if(it.getValue() != 0){
                ans = it.getKey();
            }
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args){
        String a = "abaabaab";
        String b = "abaabaabb";

        find(b, a);
        
    }
}
