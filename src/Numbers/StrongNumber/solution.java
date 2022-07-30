package Numbers.StrongNumber;

public class solution { 

    public static int factorial(int n){
        int ans = 1;
        for(int i=1; i<=n ; i++){
            ans = ans * i;
        }
        return ans;
    }

    public static boolean isStrong(int n){
        int num = n;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + factorial(digit);
            num = num/10;
        }
        
        if(sum == n){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isStrong(145));
    }

}
