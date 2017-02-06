/**
 * Created by SerLonic on 06.02.2017.
 * first proj with new class
 */

public class MainClass {
    public static void main(String[] argc){
        People newPeople = new People(64, 19, "Sergey", "Fedorenko");
        System.out.println("FIO is: " + newPeople.getFIO());
        System.out.println("Age: " + newPeople.getAge());
        System.out.println("Weight: " + newPeople.getWeight());
    }
}
