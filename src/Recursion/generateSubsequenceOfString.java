package Recursion;
import java.util.Scanner;
public class generateSubsequenceOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str="";
        generateSubsequenceOfStringAns(0,s,str);

    }
    public static void generateSubsequenceOfStringAns(int i,String s,String ans){
        if(i==s.length()) {
        System.out.println(ans);
            return;
        }
        generateSubsequenceOfStringAns(i+1,s,ans);
        generateSubsequenceOfStringAns(i+1,s,ans+s.charAt(i));
    }
}
