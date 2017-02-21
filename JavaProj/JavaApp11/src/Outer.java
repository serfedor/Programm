/**
 * Created by SerLonic on 20.02.2017.
 */
public class Outer {
    Outer(int aNumObjects){
        for(int i = 0; i < aNumObjects; i++) {
            Inner object = new Inner();
            object.getVoice();
        }
    }
    class Inner{
        void getVoice(){
            System.out.println("create object in Inner class");
        }
    }
    static void testArgc(int ... v){ //function for all length arguments
        for(int aValue:v){
            System.out.println(aValue);
        }
    }
}
