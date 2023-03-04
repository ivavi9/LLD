package prototype;

public class Student {
    private int age;
    private String name;

    private String className;


    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.className = student.className;
    }

    public Student() {
    }

    @Override
    public Student clone(){
        return new Student(this);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
