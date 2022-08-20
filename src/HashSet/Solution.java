package HashSet;

import java.util.HashSet;
// import java.util.Iterator;

public class Solution {
    

    
    public static void main(String[] args){
        // creating 
        HashSet<Integer> set = new HashSet<>();

        // insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        // search
        if(set.contains(1)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        set.remove(1);

        if(set.contains(1)){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }

        // Iterator

        // final Iterator it = set.iterator();
        // // hasNext, next

        // while(it.hasNext()){
        //     System.out.print(it.next());
        // }

    }
}
