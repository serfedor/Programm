/**
 * Created by SerLonic on 05.02.2017.
 * for or foreach
 */
public class JavaApp8 {
    public static void main(String[] argc){
        boolean denom = false;
        int aNum = 10;
        for(int i = 0; !denom; i++){
            aNum-=1;
            if (aNum == 0) denom = true;
        }
        System.out.println(aNum);

        int[] theArray = new int[10];
        for (int i = 0; i<10; i++)
            theArray[i] = (int) (Math.random() * 10);//initialization array with 0 to 10

        for (int aNumber : theArray) { //fantastic :), for each number in array (each num saved in aNumber)
            System.out.println(aNumber); //print number
        }

        int[][] numArray = {{1, 3, 2}, {1, 3, 4}, {1, 5 , 2}};
        int foundNum = 0;
        int theRepeatNum = 1;
        int count =0;
        int middleValue = 0;
        int minValue, maxValue;
        minValue = maxValue = numArray[0][0];
        boolean fNum = false;
        for (int[] x: numArray) {
            for (int y: x) {
                System.out.println(y);
                if (y == foundNum) fNum = true;
                if(y == theRepeatNum) count++;
                if(y < minValue) minValue = y;
                if (y > maxValue) maxValue = y;
                middleValue += y/2;
            }
        }
        if(fNum) System.out.println("a num is exist: "  + foundNum);
        else System.out.println("a num don't exist");
        System.out.println("The Num "+ theRepeatNum + " have a " + count + " copy");
        System.out.println("The middle value in array equal: " + middleValue);
        System.out.println("Min value in array equal: " + minValue);
        System.out.println("Max value in array equal: " + maxValue);
    }
}
