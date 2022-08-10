package DynamicProgramming.PartitionIntoSubsets;

public class solution {
    
    public static int findTeams(int n, int k){
        

        int dp[][] = new int[k+1][n+1];
        for(int i=1; i<=k; i++){
            for(int j=1; j<=n; j++){
                if(j < i){
                    dp[i][j] = 0;
                }
                else if (j == i){
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = dp[i-1][j-1] + dp[i][j-1]*i;
                }
            }
        }
        return dp[k][n];
    }

    public static void main(String[] args){
        System.out.println(findTeams(4, 3));
    }
}
