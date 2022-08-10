package Stacks.NextGreaterElement;

import java.util.*;

public class solution {
    
    public static ArrayList<Integer> nge(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);

        for(int i=arr.length -2; i>=0; i--){
            
            while(st.size()>0 && arr[i] >= st.peek()){
                st.pop();
            }

            if(st.size() == 0){
                ans.add(0,-1);
            }

            else{
                ans.add(0, st.peek());
            }

            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args){
        int arr[] = {2,5,9,3,1,12,6,8,7};
        System.out.println(nge(arr).toString());
    }
}
