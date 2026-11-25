package oop.cats;

public class Cats {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Рыжик", 1);
        cat1.setName("Чижик");
        System.out.println("Возраст кота: " + cat1.getAge() + " год");
        try {
            cat1.setAge(-1);
            System.out.println("Кот повзрослел! Ему " + cat1.getAge() + " года");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Недопустимый возраст");
        }
        cat1.meow();
    }
}
