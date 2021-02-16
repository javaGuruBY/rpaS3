public class CircleDemo {
    public static void main(String[] args) {
        Circle oneCircle = new Circle();
        oneCircle.vvodRadius();
        double ploschad = oneCircle.calculateArea();
        System.out.println("Площадь круга с радиусом " + oneCircle.radius + " равна " + ploschad);
    }
}