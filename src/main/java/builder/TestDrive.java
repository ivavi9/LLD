package builder;

public class TestDrive {
    public static void main(String[] args) throws Exception {
        Student newStudent = Student.getBuilder().setAge(10).setName("Avi").setLocation("Andaman").setName("919191919").build();

    }
}
