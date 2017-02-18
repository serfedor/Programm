/**
 * Created by SerLonic on 18.02.2017.
 */
public class Test1 {
    final double PI = 3.14;
    private static int num;
    Test1(){
        num = 0;
    }
    Test1(int aNum){
        num = aNum;
    }
     void setNum(int aNum){
        num = aNum;
    }
    int getNum(){
         return num;
    }
    int doFactorial(int aNum){
        if(aNum == 1) return 1;
        return aNum*doFactorial(aNum-1);
    }
    double getArea(){
        return PI*num*num;
    }
}
