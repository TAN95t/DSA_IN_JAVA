package Graphs.DetectCycleInDirestedGraphUsingBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution {

    public static boolean detectCycle(int n, ArrayList<ArrayList<Integer>> adj){
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

        int count = 0;
        while(!q.isEmpty()){
            Integer node = q.poll();
            count++;

            for(Integer it : adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        if(count == n){
            return false;
        }
        return true;
    }
    
}
