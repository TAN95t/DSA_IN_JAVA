package Graphs.DetectCycleInDirectedGraphUsingDFS;

import java.util.ArrayList;

public class solution {

    public static boolean checkCycle(int node, ArrayList<ArrayList<Integer>> adj, boolean vis[], boolean dfsVis[]){
        vis[node]  = true;
        dfsVis[node] = true;

        for(int it : adj.get(node)){
            if(vis[it]==false){
                if(checkCycle(it, adj, vis, dfsVis)){
                    return true;
                }
            }
            else if(dfsVis[it]==true){
                return true;
            }
        }
        dfsVis[node] = false;
        return false;
    }

    
    public static boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[n];
        boolean dfsVis[] = new boolean[n];

        for(int i=0; i<n; i++){
            if(vis[i]==false){
                if(checkCycle(i, adj, vis, dfsVis)) return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){

    }
    
}
