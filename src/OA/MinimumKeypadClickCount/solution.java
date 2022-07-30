package OA.MinimumKeypadClickCount;

public class solution {

    static int clickCount [] = {1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3}; 

    public static int countClicks(String str){
        int n = str.length();
        int count=0;
        for(int i=0; i<n; i++){
            char curr = str.charAt(i);
            int idx = curr - 'a';
            count += clickCount[idx];
        }

        return count;
    }

    public static void main(String[] args){
        String str = "abacadefghibj";
        String str2 = "abcghdiefjoba";
        System.out.println(countClicks(str2));
        System.out.println(countClicks(str));
    }
    
}
