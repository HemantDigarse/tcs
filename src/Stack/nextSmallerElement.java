package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextSmallerElement {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        int[] nextSmaller=nextSmallerElementFind(a);
        System.out.println(Arrays.toString(nextSmaller));
    }
    public static int[] nextSmallerElementFind(int[] a){
        int[] nextSmaller=new int[a.length];
        int len=a.length;
        Stack<Integer> s=new Stack<>();
        nextSmaller[len-1]=-1;
        s.push(a[len-1]);
        for(int i=len-2;i>=0;i--){
            while(!s.isEmpty()&&s.peek()>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmaller[i]=-1;
            }
            else{
                nextSmaller[i]=s.peek();
            }
            s.push(a[i]);
        }
        return nextSmaller;
    }
}
