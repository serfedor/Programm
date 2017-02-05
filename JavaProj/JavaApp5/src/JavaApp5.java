/**
 * Created by SerLonic on 05.02.2017.
 * switch
 */
public class JavaApp5 {
    public static void main(String argc[]){
        int arraySize = 10;
        int[] theNumArray = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            theNumArray[i] = (int)(Math.random() * arraySize);
        }
        for(int i = 0; i< arraySize; i++) {
            switch (theNumArray[i]){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("a num equal < 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("a num equal =>5");
                    break;
                default:
                    break;
            }
        }
    }
}
