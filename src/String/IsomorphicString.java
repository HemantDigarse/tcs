package String;

import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s1,String s2){
        HashMap<Character,Character> map=new HashMap();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                if(!(map.get(s1.charAt(i))==s2.charAt(i))){
                    return false;
                }
            }
            else{
                if(!map.containsValue(s2.charAt(i))){
                    map.put(s1.charAt(i),s2.charAt(i));
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xzy";
        boolean ans=isIsomorphic(s1,s2);
        System.out.println(ans);
    }
}
