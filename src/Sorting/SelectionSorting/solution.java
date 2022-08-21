package Sorting.SelectionSorting;

public class solution {
    
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minIdx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {20,12,10,15,2};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        selectionSort(arr);
        System.out.println( );
        for(int i=0; i< arr.length; i++){
            System.out.print    (arr[i]+" ");
        }

        
    }
}
