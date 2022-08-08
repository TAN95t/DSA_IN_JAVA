package DynamicProgramming.FrogJumps;

public class solution {
    

    public static int minEnergy(int n, int energy[]){
        int dp[] = new int[n];
        dp[0] = 0;

        for(int i=1; i<n; i++){
            int fs = dp[i-1] + Math.abs(energy[i]-energy[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1){
                ss = dp[i-2] + Math.abs(energy[i]-energy[i-2]);
            }
            
            dp[i] = Math.min(ss, fs);
        }


        return dp[n-1];
    }

    public static void main(String[] args){
        int energy[] = {7, 4 ,4, 2, 6, 6, 3, 4 };
        int n=energy.length;    
        System.out.println(minEnergy(n,energy));
    }
}
