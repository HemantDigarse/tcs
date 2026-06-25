package SlidingWindow;
import java.util.HashMap;
import java.util.Scanner;
public class countSubStringwithAtmostKUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int ans=countsubStringWithKUniqueCharacter(s,k);
        System.out.println(ans);
    }
    public static int countsubStringWithKUniqueCharacter(String s,int k){
        HashMap<Character, Integer> map=new HashMap<>();
        int res=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.size()>k){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    map.remove(s.charAt(j));
                }
                j++;
            }
            res+=i-j+1;
        }
        return res;
    }
}
