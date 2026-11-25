package oop.dogs;

public class Dog {
    private String name;
    private int age;
    private String breed;

    // конструктор — имя совпадает с именем класса
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным!");
        }
        else {
            this.age = age;
        }
    }
    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым!");
        }
        else {
            this.name = name;
        }
    }
    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("Порода не может быть пустой!");
        }
        else {
            this.breed = breed;
        }
    }

    public void bark() {
        System.out.println(name + " говорит: Гав!");
    }
    public void sit() {System.out.println(name + " сел и ждет вашей команды!");}

}
