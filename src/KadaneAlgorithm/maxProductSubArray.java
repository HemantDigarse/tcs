package KadaneAlgorithm;
public class maxProductSubArray {
    public static void main(String[] args) {
        int[] arr={-4,-6,8,9,-10,7,-5};
        int ans=maxProduct(arr);
        System.out.println(ans);
    }
    public static int maxProduct(int[]arr){
        int minEnding=arr[0];
        int maxEnding=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int c1=arr[i];
            int c2=maxEnding*arr[i];
            int c3=minEnding*arr[i];
            minEnding=Math.min(c1,Math.min(c2,c3));
            maxEnding=Math.max(c1,Math.max(c2,c3));
            ans=Math.max(ans,Math.max(minEnding,maxEnding));
        }
        return ans;
    }
}
