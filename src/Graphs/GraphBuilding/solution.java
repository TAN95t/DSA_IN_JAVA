package Graphs.GraphBuilding;

import java.util.ArrayList;

public class solution {


    public static int[][] graphMatrix(int m[][]){
        // edge 1-2
        m[1][2] = 1;
        m[2][1] = 1;
        // edge 2-3
        m[2][3] = 1;
        m[3][2] = 1;
        // edge 1-3
        m[1][3] = 1;
        m[3][1] = 1;

        return m;
    }


    // general version to store the edges in an adjacency ArrayList
    // adj.get(u).add(v)
    // adj.get(v).add(u)

    // if in case weights are also given we need to store a pair data type in place of integer



    public static void main(String[] args){
        int n=3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<Integer>());
        }
        // edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);
        // edge 2---3
        adj.get(3).add(2);
        adj.get(2).add(3);
        // edge 1---3
        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i=1; i<n; i++){
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.println(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }

        // using matrix
        int adjM[][] = new int[n+1][n+1];
        adjM=graphMatrix(adjM);
    }
}
