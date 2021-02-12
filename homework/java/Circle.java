import java.util.Scanner;
public class Circle {
    public double radius;

    public double calculateArea(){
        return  Math.PI*Math.pow(this.radius,2);
    }
    public void vvodRadius(){
        Scanner in = new Scanner(System.in);
        System.out.println("введите радиус");
        this.radius = in.nextInt();
    }
}

