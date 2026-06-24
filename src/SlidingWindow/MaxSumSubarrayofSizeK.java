package SlidingWindow;

public class MaxSumSubarrayofSizeK {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        int ans=findAns(arr,k);
        System.out.println(ans);
    }
    public static int findAns(int[] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        int j=0;
        for(int i=k;i<arr.length;i++){
            sum-=arr[j++];
            sum+=arr[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}
