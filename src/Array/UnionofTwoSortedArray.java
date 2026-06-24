package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class UnionofTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 6, 7};
        ArrayList<Integer> l=findUnion(a,b);
        System.out.println(l);

    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        int j=0;
        while(i<a.length||j<b.length){
            if(i<a.length){set.add(a[i]);i++;}
            if(j<b.length){set.add(b[j]);j++;}
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:set){
            list.add(num);
        }
        Collections.sort(list);
        return list;
    }
}
