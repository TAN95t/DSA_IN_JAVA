package Strings.ReverseWordsInAString;

import java.util.*;

public class solution {

    public static String reverse(String str){
        Stack<String> stack = new Stack<>();
        str += ' ';
        str = str.replaceAll("( )+", " ");
        int n = str.length();    
        String s = "";

        for(int i=0; i<n; i++){
            char curr = str.charAt(i);
            if(curr == ' '){
                if(s != "" && s != " "){
                    stack.push(s);
                    s = "";
                }
            }
            else{
                s = s + curr;
            }
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans += stack.pop();
            ans += ' ';
        }

        return ans;

    }


    public static String reverseWords(String str) {
        String words[] = str.trim().split(" +");

        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i>0; i--){
            sb.append(words[i]+ " ");
        }

        return sb.append(words[0]).toString(); 
    }

    public static void main(String[] args){
        String str = "Ojha is A    good boy";
        System.out.println(reverseWords(str));
    }
    
}
