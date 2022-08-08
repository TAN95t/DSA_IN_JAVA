package DynamicProgramming.MaximumSumNonAdjacentElements;

public class solution {
    
    public static int maxSumSubset(int arr[]){

        int dp[][] = new int[2][arr.length];
        dp[0][0] = arr[0];
        dp[1][0] = 0;

        for(int i=1; i<arr.length; i++){
            dp[0][i] = arr[i] + dp[1][i-1];
            dp[1][i] = Math.max(dp[0][i-1], dp[1][i-1]);
        }

        return Math.max(dp[0][arr.length-1], dp[1][arr.length-1]);

    }

    public static void main(String[] args){
        int arr[] = {5,10,10,100,5,6};
        System.out.println(maxSumSubset(arr));
    }
}
