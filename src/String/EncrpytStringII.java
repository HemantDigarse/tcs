package String;

import java.util.HashMap;

public class EncrpytStringII {
    public static void main(String[] args) {
        String S = "rrrrrrrrrrrrrrrrrrrrrrrrrooooooooooooooooooooooooooooooooooooommmmmmmiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiittttfffffffffffffffffffffffffffffffffffffzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzmmmmmmmxxxxxxxxxxxqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqxxxxxxxxxxxxxxxxxxxxxxxuuuuuuuuuuuuuuuuuuuuuuuuussssssssssssssssssssszzzzzzzzzzzzzzzssssssssssssssssssssssssssaaaaaaaaooooooooooooooooooooooooooooooooooowwwwwwwwwwooooooooooooooooooooooooooooooooooooooyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyjjjrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrxxxxxxxxxxxxjjjjjjjjjfffffffffffffffffffffffffffffffffeeeeeeeeeeeeeeeeehhhhhhhhhhhhhhhhhhhhhhyyyyyyyyyyyyyyyyyyyyyyyyyyylllllllllllllllllllllllllpppppppmmmmmmmdddddllllllllllllllllllllllllllllllllllllllllllllllllllllllllxxxxxxxxzzzzzzzzzzzzzzzzzzzzzzzzzzzzzeeeeeeeeeeeeeeeeeeeeeeeeeeeeeekkkkkkkkkbbbbbbbbbbbdddddddddddddddddddjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjdddddddddddddddddddddddddddddddrrrrrrrrrrrrnnnnnnnnnnnnnnnnnnnnnuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuiiaaaaaaaaaaaaaaaaaaapppppppppppppeeeeeeeeeeuuuuuuuuuuuuuuuuuuuuuuupppprrrrrrffffffffffffuuuuu";
        StringBuilder s=new StringBuilder();
        int count=1;
        int j=0;
        while(j<S.length()-1){
            if(S.charAt(j)==S.charAt(j+1)){
                count++;
            }
            else{
                s.append(S.charAt(j));
                StringBuilder str=new StringBuilder(Integer.toHexString(count));
                s.append(str.reverse().toString());

                count=1;
            }
            j++;
        }
        s.append(S.charAt(S.length()-1));
        StringBuilder str=new StringBuilder(Integer.toHexString(count));
        s.append(str.reverse().toString());

        System.out.println(s.reverse().toString());
    }
}
//5ucf6r4p17uaedp13a2i24u15ncr1fd23j13dbb9k1ee1dz8x38l5d7m7p19l1by16h11e21f9jcx24r3j1fy26oaw23o8a1asfz15s19u17x24qbx7m20z25f4t1fi7m25o19r