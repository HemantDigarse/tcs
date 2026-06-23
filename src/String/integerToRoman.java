package String;

import java.util.Scanner;

public class integerToRoman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans=integerToRoman(n);
        System.out.println(ans);
    }
    public static String integerToRoman(int n){
        String s="";
        String[] chr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] idx={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0;i<13;i++){
            int times=n/idx[i];
            for(int j=0;j<times;j++){
                s+=chr[i];
            }
            n=n%idx[i];
        }
        return s;
    }
}
