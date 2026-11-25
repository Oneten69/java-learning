package shapes;

public class Shapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("blue", 5, 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getColor());
    }
}
