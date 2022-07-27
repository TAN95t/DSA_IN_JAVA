package DynamicProgramming.CountWaysToReachNthStair;

import java.util.Arrays;

public class solution {
    
    public static int countWays(int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n,dp);
    }

    public static int solve(int n, int []dp){
        if(n==1 || n==0){
            return 1;
        }
        if(n<0){
            return 1;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = solve(n-1, dp) + solve(n-2, dp);

        return dp[n]%100000007;
    }

    public static void main(String[] args){
        System.out.println(countWays(76));
    }
}
