package Sorting.QuickSort;

public class solution {


    public static int partition (int arr[], int low, int hi){
        int pivot = arr[hi];
        int i = low-1;

        for(int j=low; j<hi; j++){
            if(arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[hi] = temp;

        return i; // pivot index

    }
    
    public static void quickSort(int arr[], int low, int hi){
        if(low < hi){
            int pidx = partition(arr, low, hi);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, hi);

        }
    }


    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;


        quickSort(arr, 0, n-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
