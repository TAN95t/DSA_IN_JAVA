package Graphs.DFSTraversalGraph;

import java.util.Arrays;
import java.util.ArrayList;

public class solution {


    public static ArrayList<Integer> dfsGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[v+1];
        ArrayList<Integer> storeDFS = new ArrayList<Integer>();
        Arrays.fill(vis, false);
        for(int i=1; i<=v; i++){
            if(vis[i]==false){
                dfs(i,adj, storeDFS, vis);
            }
        }
        return storeDFS;
    }

    // utility function to make recursive dfs calls
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer>storeDFS, boolean[] vis){
        storeDFS.add(node);
        vis[node] = true;
        for(Integer it : adj.get(node)){
            if(vis[it] == false){
                dfs(it ,adj, storeDFS, vis);
            }
        }
    }

    public static void main(String[] args){

    }
}
