package oop.persons;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }
    public void work() {
        System.out.println(getName() + " gets " + salary + "$");
    }
}
