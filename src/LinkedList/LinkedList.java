package LinkedList;

import java.util.List;

public class LinkedList {
    LinkedList next;
    int val;
    LinkedList(int val){
        this.val=val;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        LinkedList dummy=new LinkedList(-1);
        LinkedList tail=dummy;
        for(int num:arr){
            tail.next=new LinkedList(num);
            tail=tail.next;
        }
        dummy=dummy.next;
        while(dummy!=null){
            System.out.println(dummy.val);
            dummy=dummy.next;
        }
    }
}
