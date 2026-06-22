package String;

import java.util.Scanner;

public class Palindrome {
    public static String pall(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return "Not a Palindrome String";
            }
            i++;
            j--;
        }
        return "Palindrome String";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res=pall(s);
        System.out.println(res);

    }
}
//Current Approach-->2 pointers

