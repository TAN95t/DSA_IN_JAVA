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


    // solving using tabulation
    public static int tabulation(int n){
        int [] dp = new int [n+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i] = dp[i-1];
            }
            else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];
            }
            else{
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
        }

        return dp[n];
    }

    public static void main(String[] args){
        System.out.println(countWays(76));
        System.out.println(tabulation(76));
    }
}
