package Backtracking.RatInAMaze;

import java.util.*;

public class solution {

    public static void solve(int i, int j, int a[][], int n, ArrayList<String> ans, String move, boolean vis[][]){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }

        // downword
        if(i+1<n && vis[i+1][j] == false && a[i+1][j]==1){
            vis[i][j]=true;
            solve(i+1, j, a, n, ans, move+'D', vis);
            vis[i][j]=false;
        }

        // left
        if(j-1>=0 && vis[i][j-1]==false && a[i][j-1]==1){
            vis[i][j]=true;
            solve(i,j-1,a,n,ans,move+'L',vis);
            vis[i][j]=false;
        }

        // right
        if(j+1<n && vis[i][j+1]==false && a[i][j+1]==1){
            vis[i][j]=true;
            solve(i,j+1,a,n,ans,move+'R',vis);
            vis[i][j]=false;
        }

        // upwords
        if(i-1>=0 && vis[i-1][j]==false && a[i-1][j]==1){
            vis[i][j]=true;
            solve(i-1,j,a,n,ans,move+'U',vis);
            vis[i][j]=false;
        }
    }
    

    public static ArrayList<String> findPath(int [][] m, int n){
        boolean vis[][] = new boolean[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(vis[i], false);
        }

        ArrayList<String> ans = new ArrayList<>();
        if(m[0][0]==1){
            solve(0,0,m,n,ans,"",vis);
        }
        return ans;
    }
}
