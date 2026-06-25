package PrefixSum;

import java.util.Arrays;

public class suffixArraySum {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int[] suffixArray=new int[arr.length];
        suffixArray[arr.length-1]=0;
        for(int j=arr.length-2;j>=0;j--){
            suffixArray[j]=suffixArray[j+1]+arr[j+1];
        }
        System.out.println(Arrays.toString(suffixArray));
    }
}
