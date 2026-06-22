package String;

public class Anagram {
    public static void main(String[] args) {
        String s1="geeks";
        String s2="keegs";
        boolean res=isAnagram(s1,s2);
        System.out.println(res);
    }
    public static boolean isAnagram(String s1,String s2){
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++) {
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}

//Logic(01)
//Create Freq Map of both string can compare it by freq of appearing of each Character
//Logic(02)
//Sort anc Compare Freq