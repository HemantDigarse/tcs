package PrefixSum;

public class pivotIndexFind {
    public static void main(String[] args) {
        int[] nums ={2,3,-1,8,4};
        int idx=findMiddleIndex(nums);
        System.out.println(idx);

    }
    public static int findMiddleIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            int right=(sum-left)-nums[i];
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
//Main idea behind this approach:
//                                left+nums[i]+right=totalSum;
//                                 right=totalSum-left-right -->then compare left==right
