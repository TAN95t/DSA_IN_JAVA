package DynamicProgramming.PaintFenceProblem;

public class solution {
    
    public static int countWaysToPaint(int n, int k){
        int dp[][] = new int[2][n];

        dp[0][0] = dp[1][0] = 0;
        dp[0][1] = k;
        dp[1][1] = k * (k-1);

        for(int i=2; i<n; i++){
            dp[0][i] = dp[1][i-1];
            dp[1][i] = (dp[1][i-1] + dp[0][i-1]) * (k-1);
        }

        int ways = dp[0][n-1] + dp[1][n-1];
        return ways;

        
    }

    public static void main(String[] args){
        System.out.println(countWaysToPaint(5, 3));
    }
}
