package Graphs.DetectCycleInTheGraphUsingBFS;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;


public class solution {

    static class pair{
        int current;
        int prev;
        pair(int current, int prev){
            this.current = current;
            this.prev = prev;
        }
    }


    public static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean vis[]){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(s, -1));
        vis[s]=true;

        while(!q.isEmpty()){
            pair curr = q.remove();
            int node = curr.current;
            int par = curr.prev;

            for(Integer it : adj.get(node)){
                if(vis[it]==false){
                    q.add(new pair(it, node));
                    vis[it]=true;
                }
                else if(par != it) return true;
            }
        }

        return false;
    }


    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[v+1];
        Arrays.fill(vis, false);

        for(int i=1; i<=v; i++){
            if(vis[i]==false){
                if(checkForCycle(adj, i, vis)){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args){

    }
    
}
