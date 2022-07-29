package Graphs.TopologicalSortingUsingBFS;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class solution {
    
    public static ArrayList<Integer> topologicalSort(int n, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> topoSort = new ArrayList<>();
        int indegree[] = new int[n];
        for(int i=0; i<n; i++){
            for(Integer it : adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            Integer node = q.poll();
            topoSort.add(node);
            
            for(Integer it : adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        return topoSort;
    }

    public static void main(String[] args){
        
    }


}
