package Lecture3_Level1;

public class Circle {

    private double radius;
    final double PI= 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return 2*PI*radius;
     }
}
