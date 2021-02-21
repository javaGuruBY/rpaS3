package task3_Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(25);
        circle1.setRadius(23);

        System.out.println(circle1.calculateArea());
        System.out.println(circle2.calculateArea());
    }
}
