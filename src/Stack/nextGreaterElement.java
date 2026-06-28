package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr={4,1,8,9};
        int[] rightGreater=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        int len=arr.length;
        rightGreater[len-1]=-1;
        s.push(arr[len-1]);
        for(int i=len-2;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                rightGreater[i]=-1;
            }
            else{
                rightGreater[i]=s.peek();
            }
            s.push(arr[i]);
        }
        System.out.println(Arrays.toString(rightGreater));
    }
}
//arr=[1,2,3,4]
//     2 3 4 arr.length