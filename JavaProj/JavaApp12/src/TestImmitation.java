/**
 * Created by SerLonic on 21.02.2017.
 */
public class TestImmitation {
    private int width, height, depth;
    TestImmitation(){
        width = 0;
        height = 0;
        depth = 0;
    }
    private void setParameter(int aWidth, int aHeigh, int aDepth){
        width = aWidth;
        height = aHeigh;
        depth = aDepth;
    }
    public String getParameters(){
        return width + " " + height + " " + depth;
    }
    public void getArgc(int ... v){
        System.out.println(v);
    }
}
