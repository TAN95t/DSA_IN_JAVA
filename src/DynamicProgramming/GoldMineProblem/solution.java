package DynamicProgramming.GoldMineProblem;

public class solution {
    
    public static int maxGold(int mine[][]){
        int n = mine.length;
        int m = mine[0].length;

        int dp[][] = new int[n][m];


        for(int j=m-1; j>=0; j--){
            for(int i=n-1; i>=0; i--){
                if(j == m-1){
                    dp[i][j] = mine[i][j];
                }
                else if(i == 0){
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j+1]) + mine[i][j];
                }
                else if(i == n-1){
                    dp[i][j] = Math.max(dp[i][j+1], dp[i-1][j+1]) + mine[i][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1])) + mine[i][j];
                }   
            }

            
        }
        int max = dp[0][0];
        for(int i=1; i<n; i++){
            max = Math.max(dp[i][0], max);
        }

        return max;

    }
    
    public static void main(String[] args){
        int mine[][] = {{0,1,4,2,8,2},{4,3,6,5,0,4},{1,2,4,1,4,6},{2,0,7,3,2,2},{3,1,5,9,2,4},{2,7,0,8,5,1}};
        System.out.println(maxGold(mine));
        
    }
}
