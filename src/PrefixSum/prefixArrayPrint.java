package PrefixSum;

import java.util.Arrays;

public class prefixArrayPrint {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[]prefixArray=new int[a.length];
        prefixArray[0]=0;
        for(int i=1;i<a.length;i++){
            prefixArray[i]=prefixArray[i-1]+a[i-1];
        }
        System.out.println(Arrays.toString(prefixArray));
    }
}

//prefix[0]=0
//prefix[1]=arr[0]
//prefix[2]=arr[0]+arr[1]->prefix[i-1]+arr[i-1](this is generalise form)