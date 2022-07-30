package Numbers.AutomorphicNumber;

public class solution {
    
    public static boolean isAutomorphic(int n){
        int sq = n*n;
        while(n>0){
            if(n%10 != sq%10){
                return false;
            }
            n=n/10;
            sq=sq/10;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isAutomorphic(25));
    }
}
