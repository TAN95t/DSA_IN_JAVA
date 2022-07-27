package Graphs.BFSTraversalINGraph;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class solution {
    
    public static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v+1];

        for(int i=1; i<=v; i++){
            if(vis[i] == false){

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i]=true;

                while(!q.isEmpty()){
                    Integer node = q.poll();
                    bfs.add(node);

                    for(Integer it: adj.get(node)){
                        if(vis[it]==false){
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return bfs;
    }    

    public static void main(String[] args){

    }
}
