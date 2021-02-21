public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
            }
    void  calculateArea() {
        double a = Math.PI*this.radius*this.radius;
        System.out.println("Площадь заданного круга " + a);
    }
}
