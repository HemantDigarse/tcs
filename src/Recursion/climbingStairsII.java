package Recursion;
import java.util.Scanner;
//k steps to go on top
public class climbingStairsII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int noOfWays=resDisplay(n,k);
        System.out.println(noOfWays);
    }
    public static int resDisplay(int n,int k){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int sum=0;
        for(int i=1;i<=k;i++){
            sum+=resDisplay(n-i,k);
        }
        return sum;
    }
}
