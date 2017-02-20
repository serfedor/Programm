/**
 * Created by SerLonic on 07.02.2017.
 */
public class Stack {
    private int count = -1;
    private int[] theStack;
    Stack(int stackSize){
        theStack = new int[stackSize];
    }
    void push(int anElem){
        if(count == theStack.length -1){
            return;
        }
        else theStack[++count] = anElem;
    }
    int pop(){
        if(count < 0){
            return 0;
        }
        else return theStack[count--];
    }
}