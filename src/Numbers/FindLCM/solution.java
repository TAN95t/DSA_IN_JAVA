package Numbers.FindLCM;

public class solution {

    public static int gcd(int a, int b){
        int ans = 1;
        for(int i=2; i<=Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0){
                ans = i;
            }
        }
        return ans;
    }

    public static int lcm(int a, int b){
        int ans = 0;
        int gcd = gcd(a,b);
        ans = (a*b)/gcd;
        return ans;
    }

    public static void main(String[] args){
        System.out.println(lcm(4,8));
    }

}


// lcm(a,b) = ab/gcd(a,b);
