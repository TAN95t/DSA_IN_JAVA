package OA.TransferringDataTodifferentLocations;

import java.util.Arrays;

public class solution {

    public static int[] location(int data[], int movedFrom[], int movedTo[]){
        for(int i=0; i<movedFrom.length; i++){
            int dataVal = movedFrom[i];
            System.out.println(dataVal);
            int j=0;
            while(j<data.length && data[j] != dataVal){
                j++;
            }
            data[j] = movedTo[i];
        }
        Arrays.sort(data);
        return data;
    }

    public static void main(String[] args){
        int data[] = {1,7,6,8};
        int movedFrom[] = {1,7,2};
        int movedTo[] = {2,9,5};

        int ans[] = new int [data.length];

        ans = location(data, movedFrom, movedTo);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]);
        }
    }
    
}
