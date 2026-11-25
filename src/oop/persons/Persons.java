package oop.persons;

public class Persons {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        Person person = new Person("Max", 20);
        Student student = new Student("Jamal", 18, "Oxford");
        Employee employee = new Employee("James", 30, 3000);
        GraduateStudent graduateStudent = new GraduateStudent("John", 23, "MIT", "AI");
        people[0] = person;
        people[1] = student;
        people[2] = employee;
        people[3] = graduateStudent;

        for (int i = 0; i < people.length; i++) {
            people[i].introduce();
        }
        int symbolCount = 0;
        for (int i = 0; i < people.length; i++) {
            symbolCount += people[i].getName().length();
        }
        System.out.println(symbolCount);
    }
}
