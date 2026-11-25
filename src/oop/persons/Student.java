package oop.persons;

public class Student extends Person {
    private String university;
    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
    public void study() {
        System.out.println(getName() + " studies in " + university);
    }
    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + "." + " I'm " + getAge() + " old and I study at " + university);
    }
}
