package oop.dogs;

public class Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Рекс", 3, "Овчарка");
        Dog dog2 = new Dog("Бобик", 5, "Дворняга");
        System.out.println(dog1.getName());
        dog1.setAge(0);
        dog2.bark();
        dog2.sit();
    }
}