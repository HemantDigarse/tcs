package String;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder str=new StringBuilder();
        for(char chr:s.toCharArray()){
            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
                continue;
            }
            else{
                str.append(chr);
            }
        }
        System.out.println(str.toString());
    }
}
//String will only contain LowerCase Charcaters
