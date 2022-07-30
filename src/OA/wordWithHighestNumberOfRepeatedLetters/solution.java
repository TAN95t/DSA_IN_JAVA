package OA.wordWithHighestNumberOfRepeatedLetters;

public class solution {
    

    public static void searchWord(String str){
        int n = str.length();
        int maximumWord = 0;
        int currMaxWord = 0;

        String result = "";

        for(int left=0; left<n;){
            int right = left+1;
            while(right < n && str.charAt(right) != ' '){
                right++;
            }

            int frequency[] = new int[26];
            currMaxWord=0;
            for(int idx = left; idx < right; idx++){
                frequency[str.charAt(idx)-'a']++;
            }

            for(int idx=0; idx<26; idx++){
                if(frequency[idx]>1){
                    currMaxWord++;
                }
            }

            if(currMaxWord > maximumWord){
                maximumWord = currMaxWord;
                result="";
                for(int j=left; j<right; j++){
                    result = result + str.charAt(j);
                }
            }
            left = right + 1;

        }
    }

    public static void main(String[] args){

    }
}
