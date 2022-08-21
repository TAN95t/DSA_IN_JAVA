package Sorting.InsertionSorting;

public class solution {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && key<arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args){
        int arr[] = {5,9,1,4,3};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        insertionSort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }   
    
}
