package KadaneAlgorithm;

public class maxAbsSumofSubArray {
    public static void main(String[] args) {
        int[] arr={1,-3,2,3,-4};
        int res=maxAbsoluteSum(arr);
        System.out.println(res);
    }
    public static int maxAbsoluteSum(int[] nums) {
        int ithBestSumMin=nums[0];
        int ithBestSumMax=nums[0];
        int minAns=nums[0];
        int maxAns=nums[0];
        int finalAns=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            int c1Min=nums[i];
            int c2Min=ithBestSumMin+nums[i];
            ithBestSumMin=Math.min(c1Min,c2Min);
            minAns=Math.min(ithBestSumMin,minAns);
            int c1Max=nums[i];
            int c2Max=nums[i]+ithBestSumMax;
            ithBestSumMax=Math.max(c1Max,c2Max);
            maxAns=Math.max(ithBestSumMax,maxAns);
            finalAns=Math.max(finalAns,Math.max(maxAns,Math.abs(minAns)));
        }
        return finalAns;
    }
}
