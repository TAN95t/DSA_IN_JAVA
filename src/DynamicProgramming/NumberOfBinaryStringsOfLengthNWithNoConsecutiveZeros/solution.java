package DynamicProgramming.NumberOfBinaryStringsOfLengthNWithNoConsecutiveZeros;

public class solution {
    
    // using space
    public static int count(int n){
        int ans=0;

        int dp[][] = new int[2][n+1];
        dp[0][0] = dp[1][0] = 0;
        dp[0][1] = dp[1][1] = 1;

        for(int i=2; i<=n; i++){
            dp[0][i] = dp[1][i-1];
            dp[1][i] = dp[0][i-1] + dp[1][i-1];
        }

        ans = dp[0][n] + dp[1][n];

        return ans;
    }

    // without space
    public static int countOpti(int n){
        int oldCount0 = 1;
        int oldCount1 = 1;

        int count0=0, count1=0;

        for(int i=2; i<=n; i++){
            count0 = oldCount1;
            count1 = oldCount0 + oldCount1;

            oldCount0 = count0;
            oldCount1 = count1;
        }

        int ans = count0 + count1;

        return ans;


    }

    public static void main(String[] args){
        System.out.println(count(7));
        System.out.println(countOpti(6));
    }
}
