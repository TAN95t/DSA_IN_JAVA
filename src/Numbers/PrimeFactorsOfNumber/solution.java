package Numbers.PrimeFactorsOfNumber;

import java.util.ArrayList;

public class solution {
    
    public static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2; n>1; i++){
            if(n%i==0){
                while(n%i == 0) {
                    ans.add(i);
                    n=n/i;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(primeFactors(60).toString());
    }
}
