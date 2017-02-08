/**
 * Created by SerLonic on 07.02.2017.
 */
public class JavaStack {
    public static void main(String[] argc){
        Stack stack1 = new Stack();
        for(int i = 0; i < stack1.stackSize; i++){
            stack1.push((int)(Math.random()*10));
        }
       for(int i = 0; i < stack1.stackSize; i++){
          System.out.println(stack1.pop());
       }
    }
}
