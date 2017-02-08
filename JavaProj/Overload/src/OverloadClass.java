/**
 * Created by SerLonic on 07.02.2017.
 */
public class OverloadClass {
    public static void main(String args[]){
        TestOverload obj1 = new TestOverload("Sergey", "123");
        TestOverload obj2 = new TestOverload("Sergey", "131");
        TestOverload obj3 = new TestOverload("Sergey", "131");
       /* TestOverload cloneobj1 = new TestOverload(obj1);
        System.out.println("obj 1 = obj 2: " + obj1.equalPhoneNumber(obj2));
        System.out.println("obj2 = obj3: " + obj2.equalPhoneNumber(obj3));
        System.out.println(cloneobj1.name + " " + cloneobj1.phoneNumber);
        */
        obj1.setPhoneNumber("0999999999");
        String [] arrayObject = new String[3];
        arrayObject[0] = obj1.name + " " + obj1.phoneNumber;
        arrayObject[1] = obj2.name + " " + obj2.getPhoneNumber();
        arrayObject[2] = obj3.name + " " + obj2.getPhoneNumber();
        for (String arrayObjects: arrayObject) {
            System.out.println(arrayObjects);
        }

    }
}
