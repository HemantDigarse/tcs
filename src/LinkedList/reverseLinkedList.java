package LinkedList;

public class reverseLinkedList {
    reverseLinkedList next;
    int data;
    reverseLinkedList(int data){
        this.data=data;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverseLinkedList head=creationOfLinkedList(arr);
        reverseLinkedList rev=reverse(head);
        while(rev!=null) {
            System.out.println(rev.data);
            rev = rev.next;
        }
    }
    public static reverseLinkedList creationOfLinkedList(int[] arr){
        reverseLinkedList dummy=new reverseLinkedList(-1);
        reverseLinkedList tail=dummy;
        for(int num:arr){
            tail.next=new reverseLinkedList(num);
            tail=tail.next;
        }
        return dummy.next;
    }
    public static reverseLinkedList reverse(reverseLinkedList head){
        reverseLinkedList curr=head;
        reverseLinkedList rev=null;
        while(curr!=null){
            reverseLinkedList nextNode=curr.next;
            curr.next=rev;
            rev=curr;
            curr=nextNode;
        }
        return rev;
    }
}
