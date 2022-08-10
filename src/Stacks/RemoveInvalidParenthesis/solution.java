package Stacks.RemoveInvalidParenthesis;

import java.util.*;

public class solution {

    public static void solve(String str, int mra, HashSet<String> ans){

        if(mra == 0){
            int mrnow = getMin(str);
            if(mrnow == 0){
                if(!ans.contains(str)){
                    System.out.println(str);
                    ans.add(str);
                }
            }
            return;
        }

        for(int i=0; i<str.length(); i++){
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            solve(left + right, mra -1, ans);
        }
    }
    
    public static int getMin(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.size() == 0){
                    st.push(ch);
                }
                else if (st.peek() == ')'){
                    st.push(ch);
                }
                else if(st.peek() == '('){
                    st.pop();
                }
            }
        }

        return st.size();
    }

    public static void main(String[] args){
        String str = "()())()";
        int mra = getMin(str);
        HashSet<String> ans = new HashSet<>();
        solve(str, mra, ans);
    }
}
