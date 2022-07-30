package Strings.RemoveAllDuplicatesFromInputString;

import java.util.Arrays;


public class solution {

    public static String removeDuplicates(String str){
        boolean occurance[] = new boolean[26];
        Arrays.fill(occurance, false);
        int n = str.length();
        str = str.toLowerCase();
        StringBuffer result = new StringBuffer();
        for(int i=0; i<n; i++){
            char currChar = str.charAt(i);
            if(occurance[currChar-'a']==false){
                result.append(currChar);
                occurance[currChar-'a'] = true;
            }
        }

        return result.toString();
    }

    public static void main(String[] args){
        String str = "TanayMaheshwari";
        System.out.print(removeDuplicates(str));
    }
    
}
