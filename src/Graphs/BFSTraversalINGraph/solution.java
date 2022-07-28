package Graphs.BFSTraversalINGraph;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class solution {

    public static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v + 1];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= v; i++) {
            if (vis[i] == false) {
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    Integer node = q.poll();
                    bfs.add(node);

                    for (Integer it : adj.get(node)) {
                        if (vis[it] == false) {
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return bfs;
    }

    public static ArrayList<Integer> bfsTraversal(int matrix[][], int vertex) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[vertex + 1];
        Arrays.fill(vis, false);

        for (int i = 1; i <= vertex; i++) {
            if (vis[i] == false) {
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    int node = q.remove();
                    ans.add(node);
                    for (int j = 1; j < vertex; j++) {
                        if (matrix[node][j] == 1 && vis[j] == false) {
                            q.add(j);
                            vis[j] = true;
                        }
                    }
                }
            }
        }

        return ans;
    }

    static int m[][] = new int[6][6];

    public static void addEdges(int u, int v, int matrix[][]) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    public static void main(String[] args) {

        for (int i = 0; i < m.length; i++) {
            Arrays.fill(m[i], 0);
        }

        addEdges(1, 2, m);
        addEdges(3, 2, m);
        addEdges(3, 4, m);
        addEdges(5, 3, m);
        addEdges(1, 3, m);
        addEdges(1, 5, m);

        for (int i = 0; i < m.length; i++) {
            System.out.println();
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]);
            }
        }

        System.out.println();

        System.out.println(bfsTraversal(m, 5).toString());

    }
}
