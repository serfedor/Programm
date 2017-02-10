/**
 * Created by SerLonic on 31.01.2017.
 * song about beer :)
 */
public class BeerSong {
    public static void main(String[] argc){
        int beerNum = 99;
        String word = "bottle(bottles)";
        while(beerNum>0){
            if(beerNum == 1){
                System.out.println(beerNum + " bottle on the wall, take her let in a circle");
            }
            else {
                System.out.println(beerNum + " " + word + " on the wall, take her, let in a circle");
            }
            beerNum -= 1;
        }
        System.out.println("There is no more " + word);
    }
}
