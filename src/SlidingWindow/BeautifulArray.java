package SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }
}
//Your task is to find the maximum possible average value of any subarray
//Approach--> Maximum value has always greater avg because when you choose Maximum element from Array it avg is also value itself then this is my maximum avg value