package Recursion.PatternMatchingUsingBackTracking;

import java.util.*;

public class solution {
    
    public static void solve(String str, String pattern, HashMap<Character, String> map, String op){

        if(pattern.length()==0){
            if(str.length()==0){
                HashSet<Character> set = new HashSet<>();

                for(int i=0; i<op.length(); i++){
                    char ch = op.charAt(i);
                    if(set.contains(ch) == false){
                        System.out.println(ch + "->" + map.get(ch));
                        set.add(ch);
                    }
                }
            }
            return;
        }


        char ch = pattern.charAt(0);
        String rop = pattern.substring(1);
        if(map.containsKey(ch)){
            String previousMapping = map.get(ch);

            if(str.length() >= previousMapping.length()){
                String left = str.substring(0, previousMapping.length());
                String right = str.substring(previousMapping.length());
                if(previousMapping.equals(left)){
                    solve(right, rop, map, op);
                }
            }
        }
        else{
            for(int i=0; i<str.length(); i++){
                String lh = str.substring(0, i+1);
                String rh = str.substring(i+1);

                map.put(ch, lh);
                solve(rh, rop, map, op);
                map.remove(ch);
            }
        }
    }

    public static void main(String[] args){
        String str = "graphtreegraph";
        String pattern = "pep";
        HashMap<Character, String> map = new HashMap<>();
        solve(str, pattern, map, pattern);
    }
}
