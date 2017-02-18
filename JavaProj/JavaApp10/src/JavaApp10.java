/**
 * Created by SerLonic on 18.02.2017.
 */
public class JavaApp10 {
    public static void main(String argc[]){
        Test1 object1 = new Test1();
        System.out.println(object1.doFactorial(25));
        Test1 object2 = new Test1(5);
        System.out.println(object2.getArea());
        Test1 object3 = new Test1(7);
        System.out.println(object2.getNum()); //a num of object2 equal 5
    }
}
