package oop.persons;

public class GraduateStudent extends Student {
    private String thesis;
    public GraduateStudent(String name, int age, String university, String thesis) {
        super(name, age, university);
        this.thesis = thesis;
    }
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("And the topic of my diploma thesis is " + thesis);
    }
}
