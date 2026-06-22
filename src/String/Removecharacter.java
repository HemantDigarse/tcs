package String;

import java.util.HashSet;
import java.util.Set;

public class Removecharacter {
    public static void main(String[] args) {
        String s1="computer";
        String s2="cat";
        Set<Character> set=new HashSet<>();
        for(char chr:s2.toCharArray()){
            set.add(chr);
        }
        StringBuilder str=new StringBuilder();
        for(char chr:s1.toCharArray()){
            if(!(set.contains(chr))){
                str.append(chr);
            }
        }
        System.out.println(str.toString());
    }
}
//Approach--> HashSet or HashMap
//HashSet
//First I implement hashset in s2 it will give we track of charcater
//then I check if s1 characters in s2 then i will not add to ans


