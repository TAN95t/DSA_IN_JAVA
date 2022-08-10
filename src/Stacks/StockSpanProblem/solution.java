package Stacks.StockSpanProblem;

import java.util.*;

public class solution {
    public static ArrayList<Integer> stockSpan(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length == 0){
            return ans;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        // System.out.println(stack.peek());
        ans.add(1);
        for(int i=1; i<=arr.length-1; i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans.add(i+1);
            }

            else{
                ans.add(i-stack.peek());
            }

            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args){
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(stockSpan(arr).toString());
    }
}
