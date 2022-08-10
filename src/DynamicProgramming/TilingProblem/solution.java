package DynamicProgramming.TilingProblem;

import java.util.Arrays;

public class solution {

    public static int tileFloor(int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public static int tileFloorTabulation(int n){
        int dp[] = new int [n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=0; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static int tileFloorNM(int n, int m){
        int dp[] = new int[n+1];
        
        for(int i=0; i<=n; i++){
            if(i < m){
                dp[i] = 1;
            }
            else if(i == m){
                dp[i] = 2;
            }
            else{
                dp[i] = dp[i-1] + dp[i-m];
            }
        }

        return dp[n];
    }

    public static int solve(int n, int dp[]){
        if(n<0){
            return 0;
        }
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n]%1000000007;
    }

    public static void main(String[] args){
        System.out.println(tileFloorNM(8,3));
    }
}
