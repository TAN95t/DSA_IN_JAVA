package Strings.NeedleInHayStack;

public class solution {
    
    public static int findNeedle(String hayStack, String needle){
        if(needle.length()>hayStack.length() || hayStack.length()==0){
            return -1;
        }

        for(int i=0; i<hayStack.length(); i++){
            int j=0;
            for(j=0; j<needle.length() && (i+j)<hayStack.length(); j++){
                if(hayStack.charAt(i+j) == needle.charAt(j)){
                    continue;
                }
                else{
                    break;
                }
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String needle = "niv";
        String hayStack = "luniv";
        System.out.println(findNeedle(hayStack, needle));
    }
}
