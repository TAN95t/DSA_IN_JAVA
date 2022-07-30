package Strings.changeEveryLetterWithNextLexographicAlphabet;

public class solution {
    
    public static String findNextLex(String str){
        int n = str.length();
        StringBuffer ans = new StringBuffer();
        for(int i=0; i<n; i++){
            int ascii = (int)(str.charAt(i));
            if(ascii == 90){
                ans.insert(i, (char)(65));
            }
            else if(ascii == 122){
                ans.insert(i, (char)(97));
            }

            else if((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122)){
                ans.insert(i, (char)(ascii + 1));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args){

    }
}
