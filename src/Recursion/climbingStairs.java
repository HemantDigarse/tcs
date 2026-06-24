package Recursion;
import java.util.Scanner;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        path(n,"");
    }
    public static void path(int n,String s){
        if(n==0){
            System.out.println(s);
            return ;
        }
        if(n<0) {
            return ;
        }
        path(n-1,s+"J1");
        path(n-2,s+"J2");
        path(n-3,s+"J3");
    }
}
