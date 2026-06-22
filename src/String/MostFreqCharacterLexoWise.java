package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MostFreqCharacterLexoWise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char chr=findMostFreqCharacter(s);
        System.out.println(chr);
    }
    public static char findMostFreqCharacter(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char chr:s.toCharArray()){
            map.put(chr,map.getOrDefault(chr,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return b[0]-a[0];
            }
            else{
                return a[1]-b[1];
            }
        });
        for(char chr:map.keySet()){
            pq.offer(new int[]{map.get(chr),chr-'a'});
        }
        char chr=(char)(pq.peek()[1]+'a');
        return chr;
    }
}
