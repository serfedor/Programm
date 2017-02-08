/**
 * Created by SerLonic on 07.02.2017.
 */
public class Stack {
    int count = -1;
    int stackSize = 10;
    int[] stack = new int[stackSize];
    void push(int anElem){
        if(count == stackSize -1){
            return;
        }
        else stack[++count] = anElem;
    }
    int pop(){
        if(count < 0){
            return 0;
        }
        else return stack[count--];
    }
}