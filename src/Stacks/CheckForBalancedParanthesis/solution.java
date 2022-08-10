package Stacks.CheckForBalancedParanthesis;

import java.util.*;

public class solution {

    public static boolean isValidParenthesis(String expression) {
        
        Stack<Character> st = new Stack<>();
        for(char it : expression.toCharArray()){
            if(it == '(' || it == '{' || it == '['){
                st.push(it);
            }
            else{
                if(st.isEmpty()) {return false;}
                char ch = st.pop();
                if((it == ')' && ch == '(') || (it == '}' && ch == '{') || (it == ']' && ch == '[')){
                    continue;
                }
                else return false;
            }
        }
        
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
    

    public static void main(String[] args){
        String str = "((((()))){}{})";
        System.out.println(isValidParenthesis(str));
    }
}
