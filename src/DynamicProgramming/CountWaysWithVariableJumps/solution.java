package DynamicProgramming.CountWaysWithVariableJumps;

public class solution {

    public static int countWays(int n, int jump[]){
        int dp[] = new int[n+1];
        dp[n] = 1;
        for(int i=n-1; i>=0; i--){
            for(int j=1; j<=jump[i] && i+j < dp.length; j++){
                dp[i] += dp[i+j];
            }
        }

        return dp[0];
    }

    public static void main(String[] args){

        int n = 6;
        int arr[] = {3,3,0,2,2,3};
        System.out.println(countWays(n, arr));
        
    }
}
