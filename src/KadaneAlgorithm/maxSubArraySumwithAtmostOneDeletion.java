package KadaneAlgorithm;

public class maxSubArraySumwithAtmostOneDeletion {
    public static void main(String[] args) {
        int[] arr={-7,6,1,3,4,5,-1};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete=Integer.MIN_VALUE;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int prevNoDelete=nodelete;
            int prevOneDelete=onedelete;
            nodelete=Math.max(prevNoDelete+arr[i],arr[i]);
            int val=0;
            if(onedelete==Integer.MIN_VALUE){
                val=arr[i];
                onedelete=Math.max(val,prevNoDelete);
            }
            else{
                val=prevOneDelete;
                onedelete=Math.max(val+arr[i],prevNoDelete);
            }
            System.out.println(nodelete+"--->"+onedelete);
            ans=Math.max(ans,Math.max(nodelete,onedelete));
        }
        return ans;
    }
}
