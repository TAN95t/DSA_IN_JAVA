package Stacks.CelebrityProblem;

import java.util.*;

public class solution {
    
    public static int findCelebrity(int matrix[][], int n){
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }

        while(st.size() >= 2){
            int i = st.pop();
            int j = st.pop();

            if(matrix[i][j] == 1){
                // i knows j => i cannot be celib
                st.push(j);
            }
            else if(matrix[i][j] == 0){
                // i does not know j => j cannot be celibrity
                st.push(i);
            }
        }

        int pot = st.pop();

            for(int i=0; i<n; i++){
                if(i != pot){
                    if(matrix[i][pot] == 0 || matrix[pot][i] == 1){
                        return -1;
                    }
                }
            }

            ans = pot;

        return ans;
    }

    public static void main(String[] args){
        // int matrix[][] = {{0,1,1,1,1},{1,0,0,0,0},{1,0,0,1,0},{0,0,0,0,0},{0,1,0,1,0}};

        int m[][] = {{0,1,1,1},{1,0,1,0},{0,0,0,0},{1,1,1,0}};

        int celebrity = findCelebrity(m, m.length);

        System.out.println(celebrity);

    }
}
