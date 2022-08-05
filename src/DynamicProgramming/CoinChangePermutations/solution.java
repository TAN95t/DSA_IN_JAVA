package DynamicProgramming.CoinChangePermutations;

public class solution {
    
    public static int findPermutations(int coins[], int target){
        int dp[] = new int [target+1];
        dp[0] = 1;

        for(int amt=1; amt<=target; amt++){
            for(int coin : coins){
                if(coin <= amt){
                    int ramt = amt - coin;
                    dp[amt] += dp[ramt];
                }
            }
        }

        return dp[target];
    }

    public static void main(String[] args){
        int coins[] = {2,3,5,6};
        int target = 10;
        System.out.println(findPermutations(coins, target));
    }
}
