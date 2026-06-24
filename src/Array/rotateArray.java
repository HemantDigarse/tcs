package Array;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d=2;
        d=d%arr.length;
        displayRotatedArray(arr,0,arr.length-1);
        displayRotatedArray(arr,0,arr.length-1-d);
        displayRotatedArray(arr,arr.length-d,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void displayRotatedArray(int[]arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
