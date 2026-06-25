package PrefixSum.HashMapPattern;

import java.util.HashMap;

public class SubArraySumEqualstoK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int k=3;
        int resCount=subarraySum(arr,k);
        System.out.println(resCount);

    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int run=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            run+=nums[i];
            if(map.containsKey(run-k)){
                count+=map.get(run-k);
            }
            map.put(run,map.getOrDefault(run,0)+1);
        }
        return count;
    }
}
