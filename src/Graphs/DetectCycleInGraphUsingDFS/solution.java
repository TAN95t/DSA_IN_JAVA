package Graphs.DetectCycleInGraphUsingDFS;

import java.util.ArrayList;
import java.util.Arrays;

public class solution {

    public static boolean checkForCycle(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj ){
        vis[node]=true;
        for(int it : adj.get(node)){
            if(vis[it]==false){
                if(checkForCycle(it, node, vis, adj)) return true;
            }
            else if(it != parent) return true;
        }

        return false;
    }

    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        Arrays.fill(vis, false);
        for(int i=1; i<=v; i++){
            if(!vis[i]){
                if(checkForCycle(i, -1, vis, adj)){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args){

    }
    
}
