package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequenciesnaLimitedArray {
    public static void main(String[] args) {
        int arr[] ={2, 3, 2, 3, 5};
        List<Integer> l=frequencyCount(arr);
        System.out.println(l);
    }
    public static List<Integer> frequencyCount(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        List<Integer> list=new ArrayList<>();
        while(i<arr.length){
            if(map.containsKey(i+1)){
                list.add(map.get(i+1));
            }
            else{
                list.add(0);
            }
            i++;
        }
        return list;
    }
}
