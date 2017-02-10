/**
 * Created by SerLonic on 06.02.2017.
 */
class People {
        int weight;
        int age;
        String name, surname;
        People(int aWeight, int anAge, String aName, String aSurname){
            weight = aWeight;
            age = anAge;
            name = aName;
            surname = aSurname;
        }
    String getFIO(){
        return name + " " + surname;
    }
    int getAge(){return age;}
    int getWeight(){return weight;}
}
