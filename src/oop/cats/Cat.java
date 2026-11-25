package oop.cats;


public class Cat {
    private String name; //ИНКАПСУЛЯЦИЯ... private нужен чтобы не редачилось снаружи например -20 лет коту
    private int age; // а только через методы самого класса который можно контролить поставив условия
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void meow() {
        System.out.println(name + " говорит: Мяу!");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
    }
    public String getName() {return name;}
    public int getAge() {return age;}
}


