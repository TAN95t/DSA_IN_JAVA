package Backtracking.WordBreakProblem;

import java.util.*;

public class solution {
    

    public static void wordBreak(String str, String ans, HashSet<String> dict){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            String left = str.substring(0, i+1);
            if(dict.contains(left)){
                String right = str.substring(i+1);
                wordBreak(right, ans+left+" ", dict);
            }
        }
    }
}
