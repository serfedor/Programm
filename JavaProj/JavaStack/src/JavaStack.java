/**
 * Created by SerLonic on 07.02.2017.
 */
public class JavaStack {
    public static void main(String[] argc){
        int stackSize = 10;
        Stack stack1 = new Stack(stackSize);
        for(int i = 0; i < stackSize; i++){
            stack1.push((int)(Math.random()*stackSize));
        }
       for(int i = 0; i < stackSize; i++){
          System.out.println(stack1.pop());
       }
    }
}
