package PrefixSum.HashMapPattern;

import java.util.HashMap;
import java.util.Scanner;

public class subArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={4,5,0,-2,-3,1};
        int k=sc.nextInt();
        int ans=subarraysDivByK(arr,k);
        System.out.println(ans);
    }
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int runSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            runSum+=nums[i];
            int rem=runSum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
