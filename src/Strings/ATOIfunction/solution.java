package Strings.ATOIfunction;

public class solution {

    public static int atoi(String str){
        int n=str.length();
        int result = 0;
        for(int i=0; i<n; i++){
            int val = str.charAt(i)-'0';
            if(val>=0 && val<=9){
                result = (result*10)+val;
            }
        }
        return result;
    }

    public static void main(String[] args){
        
    }
}
