package Arrays.FindMinimumAndSecondMinimum;



public class solution {
    

    public static void find(int arr[]){
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=least){
                sleast = least;
                least = arr[i];
            }
            else if(arr[i]<=sleast){
                sleast = arr[i];
            }
        }

        System.out.println("Least Element: " + least);
        System.out.println("Second Least Element: " + sleast);
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,0};
        find(arr);
    }
}
