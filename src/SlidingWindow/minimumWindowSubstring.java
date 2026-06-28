package SlidingWindow;

import java.util.HashMap;

public class minimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res=minWindow(s,t);
        System.out.println(res);

    }
    public static String minWindow(String s, String t) {
        int countReq=t.length();
        int min=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char chr:t.toCharArray()){
            map.put(chr,map.getOrDefault(chr,0)+1);
        }
        int j=0;
        String minString="";
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))>=1){
                    countReq--;
                }
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }
            else{
                map.put(s.charAt(i),-1);
            }
            while(countReq==0){
                if(min>i-j+1){
                    min=Math.min(i-j+1,min);
                    minString=s.substring(j,i+1);
                }
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
                if(map.get(s.charAt(j))>=1){
                    countReq++;
                }
                j++;
            }
        }
        return minString;
    }
}
