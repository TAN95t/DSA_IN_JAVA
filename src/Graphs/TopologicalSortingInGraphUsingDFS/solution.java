package Graphs.TopologicalSortingInGraphUsingDFS;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

public class solution {
    static void findTopoSort(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack ){
        vis[node] = true;
        for(Integer it : adj.get(node)){
            if(vis[it]==false){
                findTopoSort(it, vis, adj, stack);
            }
        }
        stack.push(node);
    }

    static ArrayList<Integer> topologicalSort(int n , ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[n+1];
        Arrays.fill(vis, false);


        for(int i=0; i<n; i++){
            if(vis[i]==false){
                findTopoSort(i, vis, adj, stack);
            }
        }

        ArrayList<Integer> topoSort = new ArrayList<>();
        while(!stack.isEmpty()){
            topoSort.add(stack.pop());
        }

        return topoSort;
    }

    public static void main(String[] args){
        
    }
}
