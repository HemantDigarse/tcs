package PrefixSum.HashMapPattern;
import java.util.HashMap;
import java.util.Scanner;
public class contiguousArrayApproachII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] a=new int[len];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int res=maxLengthEqualZeroAndOne(a);
        System.out.println(res);
    }
    public static int maxLengthEqualZeroAndOne(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int oneCount=0;
        int zeroCount=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount++;
            }
            if(arr[i]==1){
                oneCount++;
            }
            int diff=oneCount-zeroCount;
            if(map.containsKey(diff)) {
                max=Math.max(max,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }
        }
        return max;
    }
}
//{0,1,1,1,0,0,0,0}
//PrefixSum+HashMap
//