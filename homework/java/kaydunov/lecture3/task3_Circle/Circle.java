package task3_Circle;

public class Circle {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 2*Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
