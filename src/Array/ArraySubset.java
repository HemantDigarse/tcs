package Array;

import java.util.HashMap;

public class ArraySubset {
    public static void main(String[] args) {
        int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int b[] = {11, 3, 7, 1, 7};
        boolean isTrue=isSubset(a,b);
        System.out.println(isTrue);

    }
    public static boolean isSubset(int[]a,int[]b){
        if(b.length>a.length){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:b){
            if(map.containsKey(num)){
                map.put(num,map.get(num)-1);
                if(map.get(num)==0){
                    map.remove(num);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
