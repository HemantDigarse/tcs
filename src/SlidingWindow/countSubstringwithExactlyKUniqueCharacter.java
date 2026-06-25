package SlidingWindow;

import java.util.HashMap;
import java.util.Scanner;

public class countSubstringwithExactlyKUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int ans1=ansDisplay(s,k);
        int ans2=ansDisplay(s,k-1);
        System.out.println(ans1-ans2);
    }
    public static int ansDisplay(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.size()>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    map.remove(s.charAt(j));
                }
                j++;
            }
        count+=i-j+1;
        }
        return count;
    }
}
