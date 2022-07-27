package Recursion.PrintNNaturalNumbers;

public class solution {

    public static void printUpToN(int n){
        if(n==0){
            //System.out.print(n);
            return;
        }
        printUpToN(n-1);
        System.out.print(n+ " ");
    }

    public static void main(String[] args){
        printUpToN(10);
    }
    
}
