package Arrays.threeSum;

import java.util.ArrayList;
import java.util.Arrays;

public class solution {

    public static ArrayList<ArrayList<Integer>> uniqueTriplets(int arr[], int target){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n-2; i++){
            if(i==0 || (i>0 && arr[i] != arr[i-1])){
                int hi = n-1, lo=i+1, target2 = target-arr[i]; 
                while(lo<hi){
                    if(arr[lo]+arr[hi]>target2) hi--;
                    else if(arr[lo]+arr[hi] < target2) lo++;
                    else{
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[lo]);
                        list.add(arr[hi]);
                        ans.add(list);

                        while(lo<hi && arr[lo] == arr[lo+1]) lo++;
                        while(lo<hi && arr[hi] == arr[hi-1]) hi--;

                        lo++; hi--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args){

    }
}
