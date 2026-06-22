package String;

import java.util.HashMap;
import java.util.Scanner;

public class CommonSubSequences {
    public static boolean isCommonSub(String s1,String s2){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char chr:s1.toCharArray()){
            map.put(chr,map.getOrDefault(chr,0)+1);
        }
        for(char chr:s2.toCharArray()){
            if(map.containsKey(chr)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean res=isCommonSub(s1,s2);
        System.out.println(res);
    }
}
//Q
//Given two strings s1 and s2. Check whether they contain any common subsequence (non empty) or not.