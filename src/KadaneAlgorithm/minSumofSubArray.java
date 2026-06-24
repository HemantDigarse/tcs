package KadaneAlgorithm;

public class minSumofSubArray {
    public static void main(String[] args) {
        int[] arr={-2,8,-9,19,-18,40};
        int res=display(arr);
        System.out.println(res);
    }
    public static int display(int[] arr){
        int ans=arr[0];
        int bChoice=arr[0];
        for(int i=1;i<arr.length;i++){
            int c1=bChoice+arr[i];
            int c2=arr[i];
            bChoice=Math.min(c1,c2);
            ans=Math.min(bChoice,ans);
        }
        return ans;
    }
}
