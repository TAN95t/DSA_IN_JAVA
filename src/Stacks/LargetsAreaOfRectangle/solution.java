package Stacks.LargetsAreaOfRectangle;

import java.util.*;

public class solution {
    
    public static int maxArea(int arr[]){

        int rb[] = new int[arr.length]; // nse index on the right side
        Stack<Integer> st = new Stack<>();
        st.push(arr.length -1);
        rb[arr.length -1] = arr.length;
        for(int i=arr.length-2; i >= 0; i--){
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                rb[i] = arr.length;
            }
            else{
                rb[i] = st.peek();
            }
            st.push(i);
        }


        int lb[] = new int[arr.length]; // nse index on the lest side
        st.clear();
        st.push(0);
        lb[0] = -1;
        for(int i=1; i < arr.length; i++){
            while(st.size()>0 && arr[i]<arr[st.peek()]){
                st.pop();
            }

            if(st.size() == 0){
                lb[i] = -1;
            }
            else{
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int width = rb[i] - lb[i] -1;
            int area = arr[i] * width;
            maxArea = Math.max(area, maxArea);
        }



        return maxArea;
    }

    public static void main(String[] args){
        int arr[] = {6,2,5,4,5,1,6};
        System.out.println(maxArea(arr));
    }
}
