package classFour;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack implements StackInterface{

    int sizeOfStack = 0;
    List<Integer> stack = new ArrayList<>();

    @Override
    public int pop() {
        if(!isEmpty()){
            int poppedElement = stack.remove(getSize()-1);
            sizeOfStack--;
            return poppedElement;
        }
        else{
            return -1;
        }
    }

    @Override
    public void push(int dataToPush) {
        stack.add(dataToPush);
        sizeOfStack ++;

    }

    @Override
    public int getSize() {
        return sizeOfStack;
    }

    @Override
    public boolean isEmpty() {
        if(sizeOfStack == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "stack= " + stack;
    }
}
