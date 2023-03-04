package prototype;

public class SpecialStudent extends Student{
    private String specialNeeds;

    public SpecialStudent(SpecialStudent specialStudent){
        super(specialStudent);
        specialStudent.setSpecialNeeds("Tablet");
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public SpecialStudent() {

    }

    @Override
    public SpecialStudent clone(){
        return new SpecialStudent(this);
    }

}
