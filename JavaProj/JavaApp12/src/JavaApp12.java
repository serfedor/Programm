/**
 * Created by SerLonic on 21.02.2017.
 */
public class JavaApp12 {
    public static void main(String argc[]){
        Immitation object = new Immitation("Sergey");
        System.out.println(object.getName());
        object.setTime(12.34);
        System.out.println(object.getParameters() + " " + object.getTime());
        TestImmitation phatherObject = object;
        System.out.println(phatherObject.getParameters());
    }
}
