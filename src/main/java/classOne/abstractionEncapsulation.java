package classOne;

public class abstractionEncapsulation {
    public static void main(String[] args) {
        Student s1 = new Student(21,"AviC","JanClass");
        System.out.println(s1.getClassName());
        s1.changeClassName("FebClass");
        System.out.println(s1.getClassName());
    }
}




