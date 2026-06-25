package KadaneAlgorithm;

import java.util.Scanner;

public class SubstringWithMaxZeroOneDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=maxSubstring(s);
        System.out.println(ans);
    }
    static int maxSubstring(String s) {
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                arr[i]=1;
            }
            else{
                arr[i]=-1;
            }
        }

        int ithBestAns=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int c1=arr[i];
            int c2=arr[i]+ithBestAns;
            ithBestAns=Math.max(c1,c2);
            ans=Math.max(ithBestAns,ans);
        }
        return ans;
    }
}
