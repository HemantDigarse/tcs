package String;

import java.util.Arrays;

public class smallestAndLargestWords {
    public static void main(String[] args) {
        String s = "Hello good Morning Friends";
        String[] ans=smlLarWord(s);
        System.out.println(Arrays.toString(ans));

    }
    public static String[] smlLarWord(String s){
        String[] str=s.split(" ");
        if(s.length()==1){
            return new String[]{str[0],str[0]};
        }
        String sWord="";
        String lWord="";
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=str.length-1;
        while(i<str.length||j>=0){
            if(max<str[j].length()){
                max=str[j].length();
                lWord=str[j];
            }
            if(min>str[i].length()){
                min=str[i].length();
                sWord=str[i];
            }
            i++;
            j--;
        }
        return new String[]{sWord,lWord};
    }
}
//Kind of 2 pointer Approach
