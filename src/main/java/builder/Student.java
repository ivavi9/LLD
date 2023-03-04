package builder;

public class Student {
    int age;
    String name;
    String className;
    String location;
    String phoneNumber;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(int age, String name, String className, String location, String phoneNumber) throws Exception {

       if(age > 100){
           throw new Exception("Age is greater than 100");
       }

        this.age = age;
        this.name = name;
        this.className = className;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    static class Builder{
        int age;
        String name;
        String className;
        String location;
        String phoneNumber;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setClassName(String className) {
            this.className = className;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;

        }
        public Student build() throws Exception {
            return new Student(age,name,className,location,phoneNumber);
        }
    }
}
