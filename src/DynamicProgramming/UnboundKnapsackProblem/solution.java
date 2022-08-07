package DynamicProgramming.UnboundKnapsackProblem;

public class solution {

    public static int unboundKnaplsack(int vals[], int wts[], int cap){
        int ans = 0;
        int dp[] = new int[cap+1];
        dp[0] = 0;

        for(int bagC=1; bagC<=cap; bagC++){
            int max = 0;
            for(int i=0; i<vals.length; i++){
                
                if(wts[i] <= bagC){
                    int rBagCap = bagC - wts[i];
                    int rBagVal = dp[rBagCap];
                    int tBagVal = rBagVal+vals[i];

                    max = Math.max(max, tBagVal);
                }
            }

            dp[bagC] = max;
        }
        ans = dp[dp.length-1];
        return ans;
    }
    

    public static void main(String[] args){
        int vals[] = {15,14,10,45,20};
        int wts[] = {2,5,1,3,4};
        System.out.println(unboundKnaplsack(vals, wts, 7));
    }
}
