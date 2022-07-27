package Recursion.PrintNameNTimes;

public class solution {

    public static void printName(int n, String name){
        if(n==0){
            return;
        }
        System.out.println(name);
        printName(n-1, name);
    }


    public static void main(String[] args){
        printName(5, "Tanay");
    }
}
