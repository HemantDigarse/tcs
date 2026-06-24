package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortAccordingToAnArray {
    public static void main(String[] args) {
        int a1[] = {2, 1, 2, 3, 4};
        int a2[] = {2, 1, 2};
        relativeSort(a1,a2);
        System.out.println(Arrays.toString(a1));
    }
    static void relativeSort(int[] a1, int[] a2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:a1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->{
            return a-b;
        });
        int i=0;
        for(int num:a2){
            if(map.containsKey(num)){
                for(int j=0;j<map.get(num);j++){
                    a1[i++]=num;
                }
                map.remove(num);
            }
            else{
                continue;
            }

        }
        for(int num:map.keySet()){
            for(int j=0;j<map.get(num);j++){
                pq.offer(num);
            }
        }
        while(pq.size()>0){
            a1[i++]=pq.poll();
        }

    }
}
