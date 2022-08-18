package Graphs.CheckIfGraphIsConnected;

import java.util.*;

public class solution {

    public static void dfs(ArrayList<ArrayList<Edge>> adj, ArrayList<Integer> list, int i, boolean vis[]){
        vis[i] = true;
        list.add(i);
        for(Edge edge : adj.get(i)){
            if(vis[edge.v2] == false){
                dfs(adj, list, edge.v2, vis);
            }
        }
    }


    public static void checkConnectivity(ArrayList<ArrayList<Edge>> adj, boolean vis[], int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(vis[i]==false){
                ArrayList<Integer> list = new ArrayList<>();
                dfs(adj, list, i, vis);
                ans.add(list);
            }
        }

        if(ans.size() == 1){
            System.out.println("Connected");
        }
        else{
            System.out.println("Not Connected");
        }
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();
        int vtces[] = {0,1,2,3,4,5,6};
        int n = vtces.length;

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        boolean vis[] = new boolean[n];
        Arrays.fill(vis, false);

        adj.get(0).add(new Edge(0, 1, 10));

        adj.get(1).add(new Edge(1, 0, 10));

        adj.get(2).add(new Edge(2, 3, 10));

        adj.get(3).add(new Edge(3, 2, 10));

        adj.get(4).add(new Edge(4, 5, 10));
        adj.get(4).add(new Edge(4, 6, 10));

        adj.get(5).add(new Edge(5, 6, 10));
        adj.get(5).add(new Edge(5, 4, 10));

        adj.get(6).add(new Edge(6, 4, 10));
        adj.get(6).add(new Edge(6, 5, 10));


        checkConnectivity(adj, vis, n);

    }
}
