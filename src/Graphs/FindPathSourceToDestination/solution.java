package Graphs.FindPathSourceToDestination;

import java.util.*;

public class solution {

    static class edge {
        int v1;
        int v2;
        int wt;

        edge(int v1, int v2, int wt) {
            this.v1 = v1;
            this.v2 = v2;
            this.wt = wt;
        }
    }

    // function to print all the possible paths between source and destination
    public static void printAllPath(ArrayList<ArrayList<edge>> graph, int src, int des, boolean vis[], String psf){
        if(src == des){
            System.out.println(psf);
            return;
        }

        vis[src] = true;
        for(edge Edge : graph.get(src)){
            if(vis[Edge.v2] == false){
                printAllPath(graph, Edge.v2, des, vis, psf+Edge.v2);
            }
        }
        vis[src] = false;

    }


    // function to detect precence of path between two points
    public static boolean hasPath(ArrayList<ArrayList<edge>> graph, int src, int des, boolean vis[]) {
        if (src == des) {
            return true;
        }

        vis[src] = true;

        for (edge it : graph.get(src)) {
            if (vis[it.v2] == false) {
                boolean hasNbrPath = hasPath(graph, it.v2, des, vis);
                if (hasNbrPath == true) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int vtces[] = { 0, 1, 2, 3, 4, 5, 6 };
        int n = vtces.length;

        ArrayList<ArrayList<edge>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new edge(0, 1, 10));
        adj.get(0).add(new edge(0, 3, 40));

        adj.get(1).add(new edge(1, 2, 10));
        adj.get(1).add(new edge(1, 0, 10));

        adj.get(2).add(new edge(2, 3, 10));
        adj.get(2).add(new edge(2, 1, 10));

        adj.get(3).add(new edge(3, 0, 40));
        adj.get(3).add(new edge(3, 2, 10));
        adj.get(3).add(new edge(3, 4, 2));

        adj.get(4).add(new edge(4, 3, 2));
        adj.get(4).add(new edge(4, 5, 3));
        adj.get(4).add(new edge(4, 6, 8));

        adj.get(5).add(new edge(5, 4, 3));
        adj.get(5).add(new edge(5, 6, 3));

        adj.get(6).add(new edge(6, 5, 3));
        adj.get(6).add(new edge(6, 4, 8));

        boolean vis[] = new boolean[vtces.length];

        Arrays.fill(vis, false);

        // System.out.println(hasPath(graph, 1, 5, vis));

        printAllPath(adj, 0, 6, vis, "0");

        // System.out.println("hi");
    }
}
