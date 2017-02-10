/**
 * Created by SerLonic on 05.02.2017.
 * for
 */
public class JavaApp7 {
    public static void main(String[] args){
        float aNum = 14;
        boolean isPrime = true;
        for(int i = 2; i<=aNum/i; i++){
            if(aNum%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("a num is prime: "+ aNum);
        else System.out.println("a num isn't prime: " + aNum);
    }
}
