package String;
import java.util.Scanner;
public class EncryptTheString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="aabc";
        String res=displayEncrypt(s);
        System.out.println(res);
    }
    public static String displayEncrypt(String s){
        StringBuilder str=new StringBuilder();
        int i=0;
        int count=1;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                str.append(s.charAt(i));
                str.append(count);
                count=1;
            }
            i++;
        }
        str.append(s.charAt(s.length()-1));
        str.append(count);
        return str.reverse().toString();
    }
}


//res----->a2b1c1
//then rev