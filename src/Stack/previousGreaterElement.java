package Stack;

import java.util.Arrays;
import java.util.Stack;

public class previousGreaterElement {
    public static void main(String[] args) {
        int[] arr={60, 20, 50, 40, 10, 50, 60};
        int[] prev=prevGreaterElementFind(arr);
        System.out.println(Arrays.toString(prev));
    }
    public static int[] prevGreaterElementFind(int[] arr){
        int[] prev=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        int len=arr.length;
        prev[0]=-1;
        s.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                prev[i]=-1;
            }
            else{
                prev[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return prev;
    }
}
