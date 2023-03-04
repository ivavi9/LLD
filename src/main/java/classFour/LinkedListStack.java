package classFour;

import java.util.LinkedList;
import java.util.List;

public class LinkedListStack implements StackInterface{

    List<Integer> stack = new LinkedList();
    int sizeOfStack = 0;

    @Override
    public int pop() {
        if(!isEmpty()){
            int poppedElement =  stack.remove(getSize()-1);
            sizeOfStack--;
            return poppedElement;
        }
        return -1;
    }

    @Override
    public void push(int data) {
        sizeOfStack++;
        stack.add(data);

    }

    @Override
    public int getSize() {
        return sizeOfStack;
    }

    @Override
    public boolean isEmpty() {
        if(sizeOfStack > 0){
            return false;
        }return true;
    }

    @Override
    public String toString(){
        return "stack: " + stack;
    }
}
