package String;

import java.util.HashMap;

public class StringDuplicateRemoval {
    public static void main(String[] args) {
        String s="geEksforGEeks";
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder str=new StringBuilder();
        for(char chr:s.toCharArray()){
            if(map.containsKey(chr)){
                continue;
            }
            else{
                str.append(chr);
                map.put(chr,1);
            }
        }
        System.out.println(str.toString());//geEksforG
    }
}
