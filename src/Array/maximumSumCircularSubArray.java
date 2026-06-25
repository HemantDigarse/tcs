package Array;

public class maximumSumCircularSubArray {
    public static void main(String[] args) {
        int[]nums = {1,-2,3,-2};

        int ans=maxSubarraySumCircular(nums);
        System.out.println(ans);
    }
    public static int maxSubarraySumCircular(int[] nums) {
        int ithBestMaxSum=nums[0];
        int ithBestMinSum=nums[0];
        int maxSum=nums[0];
        int minSum=nums[0];
        int maxCircularSum=nums[0];
        for(int i=1;i<nums.length;i++){
            int c1Max=ithBestMaxSum+nums[i];
            int c2Max=nums[i];
            ithBestMaxSum=Math.max(c1Max,c2Max);
            maxSum=Math.max(maxSum,ithBestMaxSum);
            int c1Min=ithBestMinSum+nums[i];
            int c2Min=nums[i];
            ithBestMinSum=Math.min(c1Min,c2Min);
            minSum=Math.min(minSum,ithBestMinSum);
        }
        if(maxSum<0){
            return maxSum;
        }
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        System.out.println(minSum+"-->"+maxSum+"--->"+totalSum);
        maxCircularSum=Math.max(maxSum,totalSum-minSum);
        return maxCircularSum;
    }
}
