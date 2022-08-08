package DynamicProgramming.PaintHouseManyColors;

public class solution {

    // time Complexity O(n2)
    public static int findOpti(int data[][], int n){

        int dp[][] = new int [n][data[0].length];

        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;

        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = data[0][i];

            if(data[0][i] <= least){
                sleast = least;
                least = data[0][i];
            }
            else if(data[0][i] <= sleast){
                sleast = data[0][i];
            }
        }

        for(int i=1; i<dp.length; i++){

            int nLeast = Integer.MAX_VALUE;
            int nsLeast = Integer.MAX_VALUE;
            for(int j=0; j<dp[0].length; j++){
                if(least == dp[i-1][j]){
                    dp[i][j] = data[i][j] + sleast;
                }
                else{
                    dp[i][j] = data[i][j] + least;
                }

                if(dp[i][j] <= nLeast){
                    nsLeast = nLeast;
                    nLeast = dp[i][j];
                }
                else if(dp[i][j] <= nsLeast){
                    nsLeast = dp[i][j];
                }
            }

            least = nLeast;
            sleast = nsLeast;
        }


        int min = Integer.MAX_VALUE;

        for(int i=0; i<dp[0].length; i++){
            min = Math.min(dp[n-1][i], min);
        }

        return min;
    }


    // time complexity O(n3)
    public static int findMinCostToPaint(int data[][], int n){
        int min = Integer.MAX_VALUE;

        int dp[][] = new int [n][data[0].length];


        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = data[0][i];
        }


        for(int i=1; i<dp.length; i++){
            
            for(int j=0; j<dp[0].length; j++){
                min = Integer.MAX_VALUE;
                for(int k=0; k<dp[0].length; k++){
                    if(k  != j){
                        min = Math.min(dp[i-1][k], min);
                    }
                }
                dp[i][j] = min + data[i][j];
            }
        }


        // for(int i=0; i<dp.length; i++){
        //     for(int j=0; j<dp[0].length; j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        min = Integer.MAX_VALUE;

        for(int i=0; i<dp[0].length; i++){
            min = Math.min(dp[n-1][i], min);
        }

        return min;
    }

    public static void main(String[] args){

        int data[][] = {{1,5,7,2,1,4},{5,8,4,3,6,1},{3,2,9,7,2,3},{1,2,4,9,1,7}};
        int n = 4;

        System.out.println(findMinCostToPaint(data, n));

        System.out.println(findOpti(data, n));
        

    }
}
