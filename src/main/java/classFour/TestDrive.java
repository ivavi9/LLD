package classFour;

public class TestDrive {
    public static void main(String[] args) {
        StackInterface arrayStack = new LinkedListStack();
        arrayStack.push(0);
        arrayStack.pop();
        System.out.println(arrayStack.isEmpty());
        arrayStack.push(10);
        arrayStack.push(212);
        System.out.println(arrayStack.getSize());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack);
    }
}
