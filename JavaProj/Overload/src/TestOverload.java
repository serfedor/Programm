/**
 * Created by SerLonic on 07.02.2017.
 */
public class TestOverload {
    String name;
    String phoneNumber;
    TestOverload(String aName, String aphoneNumber) {
        name = aName;
        phoneNumber = aphoneNumber;
    }
    TestOverload(TestOverload object){
        name = object.name;
        phoneNumber = object.phoneNumber;
    }
    boolean equalPhoneNumber(TestOverload object){
        return (name == object.name) && (phoneNumber == object.phoneNumber);
    }
    String setPhoneNumber(String aPhoneNumber){
       return phoneNumber = aPhoneNumber;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }
}
