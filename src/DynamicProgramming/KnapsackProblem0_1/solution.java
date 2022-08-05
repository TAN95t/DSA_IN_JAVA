package DynamicProgramming.KnapsackProblem0_1;

public class solution {

    public static int fillKnapsack(int target, int val[], int wts[]){
        int dp[][] = new int [val.length+1][target+1];

        for(int i =1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if( j >= wts[i-1]){
                    int rCap = j - wts[i-1];
                    if(dp[i-1][rCap] + val[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][rCap] + val[i-1];
                    }
                    else {
                        dp[i][j] = dp[i-1][j]; // when i does not bat
                    }
                }
                else{
                    dp[i][j] = dp[i-1][j]; // when i does not bat
                }
            }
        }

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        return dp[val.length][target];
    }
    
    
    public static void main(String[] args){
        int wts[] = {2,5,1,3,4};
        int val[] = {15,14,10,45,30};
        int target = 7;
        System.out.println(fillKnapsack(target, val, wts));
    }
}
