package PrefixSum.HashMapPattern;

import java.util.HashMap;

public class contiguousArray {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,0,0,0};
        int max=findMaxLength(arr);
        System.out.println(max);
    }
    public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        int i=0;
        map.put(0,-1);
        for(int num:nums){
            if(num==0){
                sum-=1;
            }
            if(num==1){
                sum+=1;
            }
            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
            i++;
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}

//Key Idea of this Question is to maintaining the running sum and put it into HashMap
//then do not update the map because I want maximum length of equal num of one and zero containing subarray

