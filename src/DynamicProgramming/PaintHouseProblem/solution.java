package DynamicProgramming.PaintHouseProblem;

public class solution {

    public static int findMinCostToPaint(int data[][], int n){
        int min = Integer.MAX_VALUE;

        int dp[][] = new int[n][3];
        dp[0][0] = data[0][0];
        dp[0][1] = data[0][1];
        dp[0][2] = data[0][2];

        for(int i=1; i<n; i++){
            for(int j=0; j<3; j++){
                if(j == 0){
                    dp[i][j] = data[i][j] + Math.min(dp[i-1][1], dp[i-1][2]);
                }
                else if(j == 1){
                    dp[i][j] = data[i][j] + Math.min(dp[i-1][0], dp[i-1][2]);
                }
                else {
                    dp[i][j] = data[i][j] + Math.min(dp[i-1][0], dp[i-1][1]);
                }
            }
        }

        min = Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);

        return min;
    }
    
    public static void main(String[] args){
        int arr[][] = {{1,5,7},{5,8,4},{3,2,9},{1,2,4}};
        int n = arr.length;
        System.out.println(findMinCostToPaint(arr, n));
    }

}
