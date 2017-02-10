/**
 * Created by SerLonic on 02.02.2017.
 * implementation bitlogic
 */
public class JavaApp3 {
    public static void main(String args[]){
        String[] binArray = {"0000", "0001", "0010", "0011", "0100", "0101",
                "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int a = 12; //1100
        int b = 5; //0101
        int d = a&b;//0100 = 4
        int c = a|b;//1101 = 13
        int e = ~a;//0011 = -13
        int f = a^b;//1001 = 9
        System.out.println("d = " + binArray[d]);
        System.out.println("c = " + binArray[c]);
       // System.out.println("e =  " + binArray[e]); invalid index :)
        System.out.println("e =  " + e);
        System.out.println("f = " + binArray[f]);

    }
}
