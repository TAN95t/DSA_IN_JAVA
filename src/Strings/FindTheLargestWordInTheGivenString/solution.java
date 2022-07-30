package Strings.FindTheLargestWordInTheGivenString;

public class solution {

    public static String findWord(String str){
        int n = str.length();
        int i=0,j=0;
        String maxWord="";
        int maxLength =0; int maxStart= 0;

        while(j<=n){
            if(j<n && str.charAt(j) != ' '){
                j++;
            }
            else{
                int currLength = j-i;
                if(currLength > maxLength){
                    maxLength = currLength;
                    maxStart=i;
                }
                j++;
                i=j;
            }
        }

        maxWord = str.substring(maxStart, maxLength);
        return maxWord;
    }

    public static void main(String[] args){
        
    }
}
