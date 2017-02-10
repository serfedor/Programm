/**
 * Created by SerLonic on 07.02.2017.
 */
public class OverloadClass {
    public static void main(String args[]){
        TestOverload obj1 = new TestOverload("Sergey", "123");
        TestOverload obj2 = new TestOverload("Sergey", "131");
        TestOverload obj3 = new TestOverload("Sergey", "131");
        TestOverload cloneobj1 = new TestOverload(obj1);

        System.out.println("obj 1 = obj 2: " + obj1.equalPhoneNumber(obj2));
        System.out.println("obj2 = obj3: " + obj2.equalPhoneNumber(obj3));
        System.out.println(cloneobj1.getName() + " " + cloneobj1.getPhoneNumber());

        obj1.setName("Denis");
        System.out.println(obj1.getName());
        System.out.println(cloneobj1.getName());

        obj1.setPhoneNumber("0999999999");
        String [] arrayObject = new String[3];
        arrayObject[0] = obj1.getName() + " " + obj1.getPhoneNumber();
        arrayObject[1] = obj2.getName() + " " + obj2.getPhoneNumber();
        arrayObject[2] = obj3.getName() + " " + obj2.getPhoneNumber();
        for (String arrayObjects: arrayObject) {
            System.out.println(arrayObjects);
        }

    }
}
