/**
 * Created by SerLonic on 21.02.2017.
 */
public class Immitation extends TestImmitation {
    private String name;
    public double time;
    Immitation(String aName){
        super();
        name = aName;
    }
    void setTime(double aTime){
        time = aTime;
    }
    double getTime(){
        return time;
    }
    String getName(){
        return name;
    }
}
