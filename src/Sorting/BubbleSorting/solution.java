package Sorting.BubbleSorting;

public class solution {
    
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {-2,45,0,11,-9};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        bubbleSort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
