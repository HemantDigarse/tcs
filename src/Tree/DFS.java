package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DFS {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>>map=new HashMap<>();
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3));
        a.add(1);a.add(2);a.add(3);
        map.put(10,a);
        ArrayList<Integer>b=new ArrayList<>(Arrays.asList(11,12,13,14));
        map.put(1,b);
        ArrayList<Integer>c=new ArrayList<>(Arrays.asList(20,21,22));
        map.put(2,c);
        ArrayList<Integer>d=new ArrayList<>(Arrays.asList(30, 31, 32));
        map.put(3,d);ArrayList<Integer>e=new ArrayList<>(Arrays.asList(15,16));
        map.put(11,e);
        ArrayList<Integer>f=new ArrayList<>(Arrays.asList(25,35));
        map.put(13, f);
        ArrayList<Integer>g=new ArrayList<>(Arrays.asList(40,45));
        map.put(29,g);
        ArrayList<Integer>h=new ArrayList<>(Arrays.asList(9,19));
        map.put(38,h);
        ArrayList<Integer>i=new ArrayList<>(Arrays.asList(6,16,20));
        map.put(32,i);
        map.put(21, new ArrayList<>()); map.get(21).add(60);
        print(10,map);
    }
    public static void print(int src, HashMap<Integer,ArrayList<Integer>> map){
        System.out.println(src);
        if(!map.containsKey(src)){
            return;
        }
        ArrayList<Integer> l=map.get(src);
        for(int i=0;i<l.size();i++){
            int next=l.get(i);
            print(next,map);
        }
    }

}
