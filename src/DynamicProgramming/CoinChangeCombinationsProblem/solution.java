package DynamicProgramming.CoinChangeCombinationsProblem;

public class solution {
    
    // unique combinations
    public static int findCombinations(int coins[], int target){
        int dp[] = new int [target+1];
        dp[0] = 1;
        for(int i=0; i<coins.length; i++){
            for(int j = coins[i]; j<dp.length; j++){
                dp[j] += dp[j-coins[i]];
            }
        }

        return dp[target];

    }

    public static void main(String[] args){
        int coins[] = {2,3,5,6};
        int target = 10;

        System.out.println(findCombinations(coins, target));
    }
}
