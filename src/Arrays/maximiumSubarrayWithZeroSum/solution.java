package Arrays.maximiumSubarrayWithZeroSum;

import java.util.HashMap;

public class solution {
    
    public static int maxLength(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == 0){
                max = i+1;
            }
            else{
                if(map.get(sum) != null){
                    max = Math.max(max, i-map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        int arr[] = {1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(maxLength(arr));
    }
}
