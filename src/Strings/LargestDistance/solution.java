package Strings.LargestDistance;

import java.util.*;

public class solution {
    
    public static int dist(String x, String y){
        x = "my name is granar";
        y = "a";

        HashSet<Character> set = new HashSet<>();

        int start=0;
        int end = 0;
        for(int i=0; i<x.length(); i++){
            char curr = x.charAt(i);
            if(curr == y.charAt(0)){
                start = i;
                break;
            }
        }


        for(int i=start+1; i<x.length(); i++){
            char curr = x.charAt(i);
            if(curr == y.charAt(0)){
                end = i;
                break;
            }
        }


        for(int i=start; i<=end; i++){
            set.add(x.charAt(i));
        }

        return set.size()-1;
    }

    public static void main(String[] args){
        System.out.println(dist("", ""));
    }
}
