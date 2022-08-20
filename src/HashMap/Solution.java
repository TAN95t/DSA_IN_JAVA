package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Solution {
    


    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("tanay", 1);
        map.put("vinul", 2);
        map.put("deshu", 3);
        map.put("ojha", 4);
        map.put("kush", 5);

        for(Map.Entry<String, Integer> it : map.entrySet()){
            System.out.print(it.getKey()+ " ");
            System.out.print(it.getValue()+ " ");
        }

        ArrayList<String> names = new ArrayList<>(map.keySet());
        System.out.println(names.toString());

    }
}
