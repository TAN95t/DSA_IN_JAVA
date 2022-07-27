package Arrays.uniqueQuadrupals;

import java.util.ArrayList;
import java.util.Arrays;


public class solution {
    public static ArrayList<ArrayList<Integer>> uniqueQuads(int arr[], int target){
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            int target3 = target-arr[i];
            for(int j=i+1; j<n; j++){
                int target2 = target3-arr[j];
                int left = j+1;
                int right = n-1;
                while(left < right){
                    int two_sum = arr[left]+arr[right];
                    if(two_sum > target2){
                        right--;
                    }
                    else if(two_sum < target2){
                        left++;
                    }
                    else{
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[left]);
                        list.add(arr[right]);
                        result.add(list);

                        // processing the duplicates of number 3
                        while(left < right && arr[right]==list.get(3)) right--;

                        // processing the duplicates of number 4
                        while(left < right && arr[left]==list.get(2)) left++;

                    }

                }

                // processing the duplicates of number 2
                while(j+1 < n && arr[j+1] == arr[j]) j++;
            }

            // processing the duplicates of number 1
            while(i+1< n && arr[i+1]==arr[i]) i++;
        }

        return result;
    }

    
    public static void main(String[] args){
        int arr[] = {4,3,3,4,4,2,1,2,1,1};
        System.out.println(uniqueQuads(arr, 9).toString());
    }
    
}
