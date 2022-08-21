package Sorting.MergeSort;

import java.util.ArrayList;

public class solution {
    
    public static void merge(int arr[], int left, int right, int mid){
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();

        int n1= mid-left+1;
        int n2= right-mid;

        for(int i=0; i<n1; i++){
            L.add(arr[left+i]);
        }

        for(int j=0; j<n2; j++){
            R.add(arr[mid+1+j]);
        }

        int i=0, j=0, k=left;
        while(i<L.size() && j<R.size()){
            if(L.get(i)<=R.get(j)){
                arr[k] = L.get(i);
                i++;
            }
            else{
                arr[k] = R.get(j);
                j++;
            }
            k++;
        }

        while(i<L.size()){
            arr[k] = L.get(i);
            i++;
            k++;
        }

        while(j<R.size()){
            arr[k] = R.get(j);
            j++;
            k++;
        }
    }



    public static void mergeSort(int arr[], int left, int right){
        if(left < right){
            int mid = (left+right)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, right, mid);
        }
    }




    public static void main(String[] args){
        int arr[] = {6,5,12,10,9,1};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
