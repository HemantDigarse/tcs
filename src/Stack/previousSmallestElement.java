package Stack;

import java.util.Arrays;
import java.util.Stack;

public class previousSmallestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] prevS=previousSmallestElementFind(arr);
        System.out.println(Arrays.toString(prevS));
    }
    public static int[] previousSmallestElementFind(int[] arr){
        int[] prevS=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        int len=arr.length;
        prevS[0]=-1;
        s.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                prevS[i]=-1;
            }
            else{
                prevS[i]=s.pop();
            }
            s.push(arr[i]);
        }
        return prevS;
    }
}
