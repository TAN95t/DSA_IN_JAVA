package Strings.printAllDuplicatesInTheStringInSortedOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;

import java.util.Collections;
import java.util.Comparator;

public class solution {


    public static void findRepeatingChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int n = str.length();
        for(int i=0; i<n; i++){
            char currChar = str.charAt(i);
            if(!map.containsKey(currChar)){
                map.put(currChar, 1);
            }
            else{
                map.put(currChar, map.get(currChar)+1);
            }
        }

        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b){
                if(a.getValue()==b.getValue()){
                    return 0;
                }
                else if(a.getValue() > b.getValue()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getKey()+" "+list.get(i).getValue());
        }

    }


    public static void main(String[] args){
        String str = "qqqqqqqqqnnnnnnnnnssssssssssiiiiii";
        findRepeatingChar(str);
    }
}
