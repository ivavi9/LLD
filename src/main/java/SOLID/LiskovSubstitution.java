package SOLID;

public class LiskovSubstitution {
}

 abstract class Parent{
    public abstract void run();
    public abstract void doSomething();

}
class ChildOne extends Parent{

    @Override
    public void run() {
        System.out.println("I am running");
    }

    // Violation of LiskovSubstitution because now you can't plug and use something else with this class when referenced by Parent reference type
    @Override
    public void doSomething() throws IndexOutOfBoundsException {

    }

}

class ChildSecond extends Parent{

    //Behaves normally and follows LiskovSubstitution
    @Override
    public void run() {

    }

    @Override
    public void doSomething() {

    }
}
