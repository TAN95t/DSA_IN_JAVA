package Graphs.CountTheNumberOfIslandsUsingGraph;

public class solution {

    public static int solve(int n, int m, int graph[][]){
        int ans = 0;

        boolean vis[][] = new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(graph[i][j] == 0 && vis[i][j] == false){
                    drawTreeForComponent(graph, i, j, vis);
                    ans++;
                }
            }
        }

        return ans;
    }


    public static void drawTreeForComponent(int graph[][], int i, int j, boolean vis[][]){
        if(i < 0 || j < 0 || i >= graph.length ||  j >= graph.length || graph[i][j] == 1 || vis[i][j] == true){
            return;
        }



        vis[i][j] = true;


        drawTreeForComponent(graph, i-1, j, vis);
        drawTreeForComponent(graph, i, j+1, vis);
        drawTreeForComponent(graph, i+1, j, vis);
        drawTreeForComponent(graph, i, j-1, vis);
    }
    

    public static void main(String[] args){
        int graph[][] = {{0,0,1,1,1,1,1,1},{0,0,1,1,1,1,1,1},{1,1,1,1,1,1,1,0},{1,1,0,0,0,1,1,0},{1,1,1,1,0,1,1,0},{1,1,1,1,0,1,1,0},{1,1,1,1,1,1,1,0},{1,1,1,1,1,1,1,0}};
        int n = graph.length;
        int m = graph[0].length;
        System.out.println(solve(n, m, graph));

    }
}
