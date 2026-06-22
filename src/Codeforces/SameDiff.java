package Codeforces;

import java.util.Scanner;

public class SameDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char chr=s.charAt(s.length()-1);
        int count=0;
        for(char c:s.toCharArray()){
            if(c!=chr){
                count++;
            }
        }
        System.out.println(count);

    }
}
