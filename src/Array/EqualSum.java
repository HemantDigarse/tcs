package Array;

public class EqualSum {
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        String ans=equilibrium(arr);
        System.out.println(ans);
    }
    public static String equilibrium(int arr[]) {
        int rightSum=0;
        for(int num:arr){
            rightSum+=num;
        }
        int leftSum=0;
        for(int num:arr){
            leftSum+=num;
            if(leftSum==rightSum){
                return "true";
            }
            rightSum-=num;
        }
        return "false";
    }
}
//Question-->Given an array arr.
// Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right.
