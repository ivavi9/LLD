package prototype;

public class Client {
    public static void main(String[] args) {
        Registry.loadRegistry();
        Student clonedStudent = Registry.studentRegistry.get("StudentPrototype").clone();
        Student clonedSpecialStudent = Registry.studentRegistry.get("SpecialStudent").clone();

        System.out.println("Debug");

    }
}
