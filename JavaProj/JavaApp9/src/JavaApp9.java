/**
 * Created by SerLonic on 06.02.2017.
 * break with goto
 */
public class JavaApp9 {
    public static void main(String[] argc){
        int[][] numArray = new int [3][3]; //initialization array 0
        to:
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 2 && j == 0) break to;//exit without loop
                numArray[i][j] = (int) (Math.random() * 10); //
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.print("Line " + (i + 1)  + ": ");
            for (int j = 0; j < 3; j++){
                if (i ==1 & j==0) return; //Line 2 or Line 3 is empty
                System.out.print(" " + numArray[i][j]);
            }
            System.out.println();
        }

    }
}
