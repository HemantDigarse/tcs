package Array;

public class trappingRainWaterProblem {
    public static void main(String[] args) {
        int[] arr={3,0,2,3,4,5};
        int[] left=maxLeftArray(arr);
        int[] right=maxRightArray(arr);
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        int ans=0;
        for(int i=1;i<arr.length-1;i++){
            ans+=Math.min(left[i],right[i])-arr[i];
        }
        System.out.println(ans);
    }
    public static int[] maxLeftArray(int[] arr){
        int[] left=new int[arr.length];
        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        return left;
    }
    public static int[] maxRightArray(int[] arr){
        int[] right=new int[arr.length];
        int len=arr.length;
        right[len-1]=arr[len-1];
        for(int i=len-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        return right;
    }
}
