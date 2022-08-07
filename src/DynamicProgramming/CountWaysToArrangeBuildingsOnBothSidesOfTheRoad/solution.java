package DynamicProgramming.CountWaysToArrangeBuildingsOnBothSidesOfTheRoad;

public class solution {

    public static int count(int n){

        int prevB = 1;
        int prevS = 1;

        int newB = 0; int newS=0;

        for(int i=2; i<=n; i++){
            newB = prevS;
            newS = prevB + prevS;

            prevS = newS;
            prevB = newB;
        }

        int ans = newB + newS;
        ans *= ans;
        return ans; 

    }

    public static void main(String[] args){
        System.out.println(count(3));
    }
    
}
