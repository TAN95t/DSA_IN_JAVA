package DynamicProgramming.MinimumCostPathInMatrix;

public class solution {
    
    public static int minCostPath(int cost[][]){
        int n = cost.length;
        int m = cost[0].length;
        int dp[][] = new int[n][m];
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0;  j--){
                if(i == n-1 && j == m-1){
                    dp[i][j] = cost[i][j];
                }
                else if(i == n-1){
                    dp[i][j] = dp[i][j+1] + cost[i][j];
                }
                else if(j == m-1){
                    dp[i][j] = dp[i+1][j] + cost[i][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + cost[i][j];
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args){
        
        int cost[][] = {{2,8,4,1,6,4,2},{6,0,9,5,3,8,5},{1,4,3,4,0,6,5},{6,4,7,2,4,6,1},{1,0,3,7,1,2,7},{1,5,3,2,3,0,9},{2,2,5,1,9,8,0}};
        System.out.println(minCostPath(cost));

    }
}
