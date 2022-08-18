package Graphs.CountNumberOfPerfectFriends;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// import java.util.Scanner;

public class solution {
    

    static class Edge{
        int v1;
        int v2;
        int wt;
        Edge(int v1, int v2, int wt){
            this.v1 = v1;
            this.v2 = v2;
            this.wt = wt;
        }
    }


    public static int countPairs(ArrayList<ArrayList<Integer>> components){
        int pairs = 0;

        for(int i=0; i<components.size()-1; i++){
            for(int j=i+1; j<components.size(); j++){
                int count = components.get(i).size() * components.get(j).size();
                pairs += count;
            }
        }

        return pairs;
    }


    public static void dfs(ArrayList<ArrayList<Edge>> adj, int i, ArrayList<Integer> list, boolean visited[]){
        visited[i] = true;
        list.add(i);

        for(Edge edge : adj.get(i)){
            if(visited[edge.v2] == false){
                dfs(adj, edge.v2, list, visited);
            }
        }
    }


    public static void getConnectedComponents(ArrayList<ArrayList<Edge>> adj, int vtces){
        boolean visited[] = new boolean[vtces];
        Arrays.fill(visited, false);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<vtces; i++){
            if(visited[i] == false){
                ArrayList<Integer> list = new ArrayList<>();
                dfs(adj, i, list, visited);
                ans.add(list);
            }
        }

        System.out.println(ans.toString());
    }




    public static void main(String[] args) throws IOException{
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();
        int vtces = 6;
        for(int i=0; i<vtces; i++){
            adj.add(new ArrayList<>());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<vtces; i++){
            String line = br.readLine();
            String[] parts = line.split(" ");

            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);

            adj.get(v1).add(new Edge(v1, v2, 10));
            adj.get(v2).add(new Edge(v2, v1, 10));
        }
    }
}
