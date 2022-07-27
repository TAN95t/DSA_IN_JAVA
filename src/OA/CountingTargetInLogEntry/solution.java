package OA.CountingTargetInLogEntry;

public class solution {

    public static int findCount(String s, String t){
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            arr[curr-'a']++;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<t.length(); i++){
            int val = arr[t.charAt(i)-'a'];
            min = Math.min(val, min);
        }

        return min;
    }

    public static void main(String[] args){
        String s = "monomon";
        String t = "mon";

        System.out.println(findCount(s, t));
    }
}
