package Arrays.DiagonalTraversalOfMatrix;

import java.util.*;

public class solution {
    

    public static ArrayList<ArrayList<Integer>> traverseDiagonally(int[][] arr, int row, int col){
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<row+col-1; i++){
            ans.add(new ArrayList<Integer>());
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans.get(i+j).add(0,arr[i][j]);
            }
        }
        
        return ans;
    }

    public static void main(String[] args){
        int row = 3; 
        int col = 3;
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(traverseDiagonally(arr, row, col).toString());
    }
}
