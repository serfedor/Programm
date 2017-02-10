/**
 * Created by SerLonic on 07.02.2017.
 */
public class TestOverload {
    private String name;
    private String phoneNumber;
    TestOverload(String aName, String aphoneNumber) {
        name = aName;
        phoneNumber = aphoneNumber;
    }
    TestOverload(TestOverload object){
        name = object.name;
        phoneNumber = object.phoneNumber;
    }
    boolean equalPhoneNumber(TestOverload object){
        return name.equals(object.name) && phoneNumber.equals(object.phoneNumber);
    }
    void setPhoneNumber(String aPhoneNumber){
       phoneNumber = aPhoneNumber;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }
    void setName(String aName){name = aName;}
    String getName(){return name;}
}
