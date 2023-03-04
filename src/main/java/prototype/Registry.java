package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    public static Map<String,Student> studentRegistry = new HashMap<String, Student>();

    public static void loadRegistry(){
        Student studentOne = new Student();
        studentOne.setAge(20);
        studentOne.setName("Avi");
        studentOne.setClassName("MarchBatch");
        studentRegistry.put("StudentPrototype",studentOne);

        Student studentSpecial = new SpecialStudent();
        studentSpecial.setName("Special student");
        studentSpecial.setAge(100);
        studentSpecial.setClassName("Alien Class");
        studentRegistry.put("SpecialStudent",studentSpecial);

    }


}
